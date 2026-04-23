package br.com.wasistemas.tasko.usuario.domain.usuario;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private Long id;
    private Vendedor vendedor;
    private String nomeUsuario;
    private String senha;
    private Auditoria auditoria;
}

