package br.com.wassistemas.tasko.common.domain.usuario;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AtualizarUsuario {
    Long id;
    String nomeUsuario;
    String nomeCompleto;
    String numeroTelefone;
    String senha;
    Long vendedorId;
    boolean indicadorAtivo;
}

