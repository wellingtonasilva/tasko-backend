package br.com.wasistemas.tasko.usuario.adapter.in.web.response;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import lombok.Data;

@Data
public class UsuarioResponse {
    private Long id;
    private Vendedor vendedor;
    private String nomeUsuario;
    private String senha;
    private Auditoria auditoria;
}

