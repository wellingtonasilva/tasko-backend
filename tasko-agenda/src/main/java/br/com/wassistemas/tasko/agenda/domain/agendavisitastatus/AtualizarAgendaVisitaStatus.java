package br.com.wassistemas.tasko.agenda.domain.agendavisitastatus;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarAgendaVisitaStatus {
    Long id;
    String descricaoVisitaStatus;
}
