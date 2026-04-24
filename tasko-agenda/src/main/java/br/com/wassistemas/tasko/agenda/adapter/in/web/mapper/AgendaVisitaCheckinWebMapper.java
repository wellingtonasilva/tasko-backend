package br.com.wassistemas.tasko.agenda.adapter.in.web.mapper;

import br.com.wassistemas.tasko.agenda.adapter.in.web.request.AdicionarAgendaVisitaCheckinRequest;
import br.com.wassistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AgendaVisitaCheckinWebMapper {
    AdicionarAgendaVisitaCheckin toDomain(AdicionarAgendaVisitaCheckinRequest request);
}
