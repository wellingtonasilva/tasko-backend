package br.com.wasistemas.tasko.usuario.domain.usuario;

import lombok.Value;

@Value
public class AdicionarUsuario {
    String nomeUsuario;
    String senha;
    Long vendedorId;
}

