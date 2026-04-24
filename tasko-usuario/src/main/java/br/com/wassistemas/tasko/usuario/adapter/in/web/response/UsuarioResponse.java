package br.com.wassistemas.tasko.usuario.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;
import java.util.List;
import lombok.Data;

@Data
public class UsuarioResponse {
    private Long id;
    private Vendedor vendedor;
    private String nomeUsuario;
    private String senha;
    private Auditoria auditoria;
    private List<UsuarioPerfilResponse> perfis;
}

