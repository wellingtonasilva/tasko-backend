package br.com.wasistemas.tasko.agenda.domain.checkinstipo;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CheckinsTipo {
    private Long id;
    private String descricaoCheckinTipo;
    private Auditoria auditoria;
}
