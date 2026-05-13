package br.com.wassistemas.tasko.agenda.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.projections.AgendaVisitaProjection;
import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaEntity;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AdicionarAgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AgendaVisita;
import br.com.wassistemas.tasko.agenda.domain.agendavisita.AtualizarAgendaVisita;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AgendaVisitaEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    AgendaVisita toDomain(AgendaVisitaEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataRealizada", ignore = true)
    @Mapping(target = "duracaoReal", ignore = true)
    @Mapping(target = "resultado", ignore = true)
    @Mapping(target = "pedidoGerado", ignore = true)
    @Mapping(target = "pedidoId", ignore = true)
    @Mapping(target = "valorPedido", ignore = true)
    @Mapping(target = "sincronizado", ignore = true)
    AgendaVisitaEntity toEntity(AdicionarAgendaVisita domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    AgendaVisitaEntity toEntity(Long id, AtualizarAgendaVisita domain);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAgendaVisitaEntity(AtualizarAgendaVisita domain, @MappingTarget AgendaVisitaEntity entity);

    AgendaVisita toDomain(AgendaVisitaProjection projection);
}
