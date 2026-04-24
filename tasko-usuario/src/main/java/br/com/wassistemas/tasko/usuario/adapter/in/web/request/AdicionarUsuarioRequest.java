package br.com.wassistemas.tasko.usuario.adapter.in.web.request;

import lombok.Value;

@Value
public class AdicionarUsuarioRequest {
    String nomeUsuario;
    String senha;
    Long vendedorId;
}

