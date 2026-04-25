package br.com.wassistemas.tasko.usuario.application.service;

import br.com.wassistemas.tasko.common.exception.ResourceNotFoundException;
import br.com.wassistemas.tasko.common.security.JwtTokenProvider;
import br.com.wassistemas.tasko.usuario.application.port.in.usecases.UsuarioLoginUseCases;
import br.com.wassistemas.tasko.usuario.application.port.out.usuario.ObterUsuarioPorNomeUsuarioPort;
import br.com.wassistemas.tasko.usuario.domain.login.Login;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLoginEmpresa;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioLoginService implements UsuarioLoginUseCases {

  private final ObterUsuarioPorNomeUsuarioPort obterUsuarioPorNomeUsuarioPort;
  private final JwtTokenProvider jwtTokenProvider;
  private final BCryptPasswordEncoder passwordEncoder;

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

  private String gerarToken(UsuarioLogin usuarioLogin) {
    Map<String, Object> claims = new HashMap<>();

    if (Objects.nonNull(usuarioLogin.getEmpresas()) && !usuarioLogin.getEmpresas().isEmpty()) {
      claims.put("empresas", usuarioLogin.getEmpresas()
          .stream().map(UsuarioLoginEmpresa::getId).toList());
    }

    if (Objects.nonNull(usuarioLogin.getPerfis()) && !usuarioLogin.getPerfis().isEmpty()) {
      claims.put("perfis", usuarioLogin.getPerfis()
          .stream().map(perfilLogin -> perfilLogin.getPerfilTipo().name()).toList());
    }

    return jwtTokenProvider.generateToken(usuarioLogin.getNomeUsuario(), claims);
  }
}
