package br.com.wasistemas.tasko.agenda.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaCheckinEntity;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AdicionarAgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AgendaVisitaCheckin;
import br.com.wasistemas.tasko.agenda.domain.agendavisitacheckin.AtualizarAgendaVisitaCheckin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AgendaVisitaCheckinEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    AgendaVisitaCheckin toDomain(AgendaVisitaCheckinEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    AgendaVisitaCheckinEntity toEntity(AdicionarAgendaVisitaCheckin domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    AgendaVisitaCheckinEntity toEntity(Long id, AtualizarAgendaVisitaCheckin domain);
}
