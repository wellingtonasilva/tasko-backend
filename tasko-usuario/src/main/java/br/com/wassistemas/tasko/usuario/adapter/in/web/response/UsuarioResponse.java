package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioResponse {
    private Long id;
    private Vendedor vendedor;
    private String nomeUsuario;
    private Auditoria auditoria;
    private List<UsuarioPerfilResponse> perfis;
}

