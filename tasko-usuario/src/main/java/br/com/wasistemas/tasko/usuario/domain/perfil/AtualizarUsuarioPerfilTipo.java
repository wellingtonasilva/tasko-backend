package br.com.wasistemas.tasko.usuario.domain.perfil;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarUsuarioPerfilTipo {
    private Long id;
    private String descricaoPerfilTipo;
}