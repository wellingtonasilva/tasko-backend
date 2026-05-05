package br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections;

import java.time.LocalDateTime;

public interface UsuarioPerfilProjection {

  Long getId();

  Long getPerfilTipoId();

  LocalDateTime getCriadoEm();

  LocalDateTime getAtualizadoEm();

  Boolean getIndicadorAtivo();
}

