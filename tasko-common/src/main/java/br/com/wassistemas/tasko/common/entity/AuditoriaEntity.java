package br.com.wassistemas.tasko.common.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Embeddable
@Setter
@Getter
public class AuditoriaEntity {
    /**
     * Data e hora de criação do registro.
     *
     * <p>Preenchido automaticamente no momento da inserção.
     * Não deve ser modificado após a criação.</p>
     */
    @CreatedDate
    private LocalDateTime criadoEm;


    /**
     * Data e hora de atualização do registro.
     *
     * <p>Preenchido automaticamente no momento da atualização.</p>
     */
    @LastModifiedDate
    private LocalDateTime atualizadoEm;


    private Boolean indicadorAtivo;
}
