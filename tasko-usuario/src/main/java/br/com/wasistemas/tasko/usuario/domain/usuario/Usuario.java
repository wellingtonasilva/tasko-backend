package br.com.wasistemas.tasko.usuario.domain.usuario;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private Long id;
    private Vendedor vendedor;
    private String nomeUsuario;
    private String senha;
    private List<UsuarioPerfil> perfis;
    private Auditoria auditoria;
}

