package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Embeddable
@Setter
@Getter
public class AuditoriaEntity {
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private Boolean indicadorAtivo;
}
