package br.com.wassistemas.tasko.agenda.domain.checkinstipo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarCheckinsTipo {
    Long id;
    String descricaoCheckinTipo;
}
