package br.com.wassistemas.tasko.common.domain.usuario;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AdicionarUsuario {
    String nomeUsuario;
    String senha;
    Long vendedorId;
}

