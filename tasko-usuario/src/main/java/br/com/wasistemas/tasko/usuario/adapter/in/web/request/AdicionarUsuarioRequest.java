package br.com.wasistemas.tasko.usuario.adapter.in.web.request;

import lombok.Value;

@Value
public class AdicionarUsuarioRequest {
    String nomeUsuario;
    String senha;
    // Adicione outros campos necessários para criação
}

