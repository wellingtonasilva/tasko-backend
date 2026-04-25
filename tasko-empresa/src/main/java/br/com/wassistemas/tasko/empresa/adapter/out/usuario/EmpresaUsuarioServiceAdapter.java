package br.com.wassistemas.tasko.empresa.adapter.out.usuario;

import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioEmpresaUseCases;
import br.com.wassistemas.tasko.common.usecases.usuario.UsuarioUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.usuario.EmpresaUsuarioServicePort;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpresaUsuarioServiceAdapter implements EmpresaUsuarioServicePort {

  private final UsuarioUseCases usuarioUseCases;
  private final UsuarioEmpresaUseCases usuarioEmpresaUseCases;

  @Override
  public void criarUsuarioParaEmpresa(Empresa empresa) {
    AdicionarUsuario adicionarUsuario = AdicionarUsuario.builder()
        .nomeUsuario(empresa.getNomeEmpresa() + "_admin")
        .senha("senha123")
        .build();

    Usuario usuario = usuarioUseCases.adicionar(adicionarUsuario);

    AdicionarUsuarioEmpresa adicionarUsuarioEmpresa = AdicionarUsuarioEmpresa.builder()
        .usuarioId(usuario.getId())
        .empresaId(empresa.getId())
        .build();

    usuarioEmpresaUseCases.adicionar(adicionarUsuarioEmpresa);
  }
}
