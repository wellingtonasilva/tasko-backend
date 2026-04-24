package br.com.wassistemas.tasko.usuario.adapter.in.web.request;

import lombok.Data;

@Data
public class UsuarioRequest {
    private String nomeUsuario;
    private String senha;
    // Adicione outros campos necessários para criação de usuário
}

