package br.com.wassistemas.tasko.usuario.domain.perfil;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarUsuarioPerfilTipo {
    private String descricaoPerfilTipo;
}