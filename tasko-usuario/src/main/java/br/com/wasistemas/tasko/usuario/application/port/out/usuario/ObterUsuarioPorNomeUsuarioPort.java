package br.com.wasistemas.tasko.usuario.application.port.out.usuario;

import br.com.wasistemas.tasko.usuario.domain.login.UsuarioLogin;

public interface ObterUsuarioPorNomeUsuarioPort {
    UsuarioLogin obterUsuarioPorId(String nomeUsuario, String senha);
}
