package br.com.wassistemas.tasko.usuario.domain.usuario;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AtualizarUsuario {
    Long id;
    String nomeUsuario;
    String senha;
    Long vendedorId;
}

