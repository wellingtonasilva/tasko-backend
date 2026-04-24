package br.com.wassistemas.tasko.agenda.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaStatusEntity;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AdicionarAgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AgendaVisitaStatus;
import br.com.wassistemas.tasko.agenda.domain.agendavisitastatus.AtualizarAgendaVisitaStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AgendaVisitaStatusEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    AgendaVisitaStatus toDomain(AgendaVisitaStatusEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    AgendaVisitaStatusEntity toEntity(AdicionarAgendaVisitaStatus domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    AgendaVisitaStatusEntity toEntity(Long id, AtualizarAgendaVisitaStatus domain);
}
