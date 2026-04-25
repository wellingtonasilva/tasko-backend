package br.com.wassistemas.tasko.usuario.application.port.out.usuario;

import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;

public interface ObterUsuarioPorNomeUsuarioPort {
    UsuarioLogin obterUsuarioPorNomeUsuario(String nomeUsuario);
}
