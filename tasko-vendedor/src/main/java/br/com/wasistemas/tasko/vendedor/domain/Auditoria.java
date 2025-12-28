package br.com.wasistemas.vendedor.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Auditoria {
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private Boolean indicadorAtivo;
}
