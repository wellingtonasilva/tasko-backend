package br.com.wassistemas.tasko.agenda.domain.agendavisitastatus;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AgendaVisitaStatus {
    private Long id;
    private String descricaoVisitaStatus;
    private Auditoria auditoria;
}
