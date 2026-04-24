package br.com.wassistemas.tasko.agenda.adapter.in.web.mapper;

import br.com.wassistemas.tasko.agenda.adapter.in.web.request.AdicionarAgendaVisitaRequest;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AgendaVisitaWebMapper {
    AdicionarAgendaVisita toDomain(AdicionarAgendaVisitaRequest request);
}
