package br.com.wassistemas.tasko.usuario.application.service;

import br.com.wassistemas.tasko.common.exception.ResourceNotFoundException;
import br.com.wassistemas.tasko.common.security.JwtTokenProvider;
import br.com.wassistemas.tasko.usuario.application.port.in.usecases.UsuarioLoginUseCases;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AdicionarUsuarioResetTokenPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AtualizarUsuarioResetTokenPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.AtualizarUsuarioSenhaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.EnviarEmailRecuperacaoSenhaPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPorNomeUsuarioPort;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioTokenPorTokenPort;
import br.com.wassistemas.tasko.usuario.domain.login.AtualizarUsuarioResetToken;
import br.com.wassistemas.tasko.usuario.domain.login.CriarResetToken;
import br.com.wassistemas.tasko.usuario.domain.login.Login;
import br.com.wassistemas.tasko.usuario.domain.login.ResetarSenha;
import br.com.wassistemas.tasko.usuario.domain.login.SolicitacaoRecuperarSenha;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLoginEmpresa;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;
import com.mailjet.client.errors.MailjetException;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioLoginService implements UsuarioLoginUseCases {

  private final ObterUsuarioPorNomeUsuarioPort obterUsuarioPorNomeUsuarioPort;
  private final JwtTokenProvider jwtTokenProvider;
  private final BCryptPasswordEncoder passwordEncoder;
  private final AdicionarUsuarioResetTokenPort adicionarUsuarioResetTokenPort;
  private final EnviarEmailRecuperacaoSenhaPort enviarEmailRecuperacaoSenhaPort;
  private final AtualizarUsuarioResetTokenPort atualizarUsuarioResetTokenPort;
  private final ObterUsuarioTokenPorTokenPort obterUsuarioTokenPorTokenPort;
  private final AtualizarUsuarioSenhaPort atualizarUsuarioSenhaPort;

  @Override
  public UsuarioLogin login(Login login) throws ResourceNotFoundException {
    UsuarioLogin usuarioLogin = obterUsuarioPorNomeUsuarioPort.obterUsuarioPorNomeUsuario(
        login.getNomeUsuario());

    if (Objects.isNull(usuarioLogin)) {
      throw new ResourceNotFoundException("Usuário ou senha inválidos");
    }

    if (!passwordEncoder.matches(login.getSenha(), usuarioLogin.getSenha())) {
      throw new ResourceNotFoundException("Usuário ou senha inválidos");
    }

    usuarioLogin.setToken(gerarToken(usuarioLogin));
    return usuarioLogin;
  }

  @Override
  public void solicitarRecuperacaoSenha(SolicitacaoRecuperarSenha solicitacaoRecuperarSenha)
      throws MailjetException {
    UsuarioResetToken usuarioResetToken = adicionarUsuarioResetTokenPort.adicionarUsuarioResetToken(
        CriarResetToken.builder()
            .token(UUID.randomUUID().toString())
            .email(solicitacaoRecuperarSenha.getEmail())
            .utilizado(false)
            .validoAte(LocalDateTime.now().plusMinutes(10))
            .build()
    );
    enviarEmailRecuperacaoSenhaPort.enviarEmailRecuperacaoSenha(usuarioResetToken);
  }

  @Override
  public void resetarSenha(ResetarSenha resetarSenha) throws ResourceNotFoundException {
    UsuarioResetToken usuarioResetToken = obterUsuarioTokenPorTokenPort.obterUsuarioTokenPorToken(
        resetarSenha.getToken());
    if (Objects.isNull(usuarioResetToken) || Objects.isNull(usuarioResetToken.getValidoAte())
        || usuarioResetToken.getValidoAte().isBefore(LocalDateTime.now())) {
      throw new ResourceNotFoundException("Token inválido");
    }

    if (Boolean.TRUE.equals(usuarioResetToken.getUtilizado())) {
      throw new ResourceNotFoundException("Token já utilizado");
    }

    UsuarioLogin usuarioLogin = obterUsuarioPorNomeUsuarioPort.obterUsuarioPorNomeUsuario(
        usuarioResetToken.getEmail());
    if (Objects.isNull(usuarioLogin)) {
      throw new ResourceNotFoundException("Usuário não encontrado para o email informado");
    }

    atualizarUsuarioSenhaPort.atualizarUsuarioSenha(usuarioLogin.getId(),
        passwordEncoder.encode(resetarSenha.getNovaSenha()));

    atualizarUsuarioResetTokenPort.atualizarUsuarioResetToken(
        AtualizarUsuarioResetToken.builder()
            .id(usuarioResetToken.getId())
            .utilizado(true)
            .build()
    );
  }

  private String gerarToken(UsuarioLogin usuarioLogin) {
    Map<String, Object> claims = new HashMap<>();

    if (Objects.nonNull(usuarioLogin.getEmpresas()) && !usuarioLogin.getEmpresas().isEmpty()) {
      claims.put("empresas",
          usuarioLogin.getEmpresas().stream().map(UsuarioLoginEmpresa::getEmpresaId).toList());
    }

    if (Objects.nonNull(usuarioLogin.getPerfis()) && !usuarioLogin.getPerfis().isEmpty()) {
      claims.put("perfis",
          usuarioLogin.getPerfis().stream().map(perfilLogin -> perfilLogin.getPerfilTipo().name())
              .toList());
    }

    return jwtTokenProvider.generateToken(usuarioLogin.getNomeUsuario(), claims);
  }
}
