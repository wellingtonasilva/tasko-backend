package br.com.wassistemas.tasko.agenda.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.CheckinsTipoEntity;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.AtualizarCheckinsTipo;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CheckinsTipoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    CheckinsTipo toDomain(CheckinsTipoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    CheckinsTipoEntity toEntity(AdicionarCheckinsTipo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    CheckinsTipoEntity toEntity(Long id, AtualizarCheckinsTipo domain);
}
