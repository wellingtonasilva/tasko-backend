package br.com.wassistemas.tasko.common.domain.usuario;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private Long id;
    private Vendedor vendedor;
    private String nomeUsuario;
    private String nomeCompleto;
    private String numeroTelefone;
    private String senha;
    private List<UsuarioPerfil> perfis;
    private Auditoria auditoria;
}

