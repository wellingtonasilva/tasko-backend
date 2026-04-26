package br.com.wassistemas.tasko.empresa.adapter.out.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.AdicionarUsuarioPerfil;
import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioEmpresaUseCases;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioPerfilUseCases;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.usuario.EmpresaUsuarioServicePort;
import br.com.wassistemas.tasko.empresa.domain.empresa.CriarEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpresaUsuarioServiceAdapter implements EmpresaUsuarioServicePort {

  private final UsuarioUseCases usuarioUseCases;
  private final UsuarioEmpresaUseCases usuarioEmpresaUseCases;
  private final UsuarioPerfilUseCases usuarioPerfilUseCases;

  @Override
  public void criarUsuarioParaEmpresa(Long empresaId, CriarEmpresa criarEmpresa) throws ResourceDuplicateException {
    AdicionarUsuario adicionarUsuario = AdicionarUsuario.builder()
        .nomeUsuario(criarEmpresa.getEmail())
        .senha(criarEmpresa.getSenha())
        .build();
    Usuario usuario = usuarioUseCases.adicionar(adicionarUsuario);

    AdicionarUsuarioEmpresa adicionarUsuarioEmpresa = AdicionarUsuarioEmpresa.builder()
        .usuarioId(usuario.getId())
        .empresaId(empresaId)
        .build();
    usuarioEmpresaUseCases.adicionar(adicionarUsuarioEmpresa);

    usuarioPerfilUseCases.adicionar(AdicionarUsuarioPerfil.builder()
        .usuarioId(usuario.getId())
        .perfilTipo(PerfilTipo.ROLE_ADMIN)
        .build());
  }
}
