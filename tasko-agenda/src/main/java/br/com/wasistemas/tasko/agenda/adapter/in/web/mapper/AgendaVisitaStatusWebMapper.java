package br.com.wasistemas.tasko.agenda.adapter.in.web.mapper;

import br.com.wasistemas.tasko.agenda.adapter.in.web.request.AdicionarAgendaVisitaStatusRequest;
import br.com.wasistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AgendaVisitaStatusWebMapper {
    AdicionarAgendaVisitaStatus toDomain(AdicionarAgendaVisitaStatusRequest request);
}
