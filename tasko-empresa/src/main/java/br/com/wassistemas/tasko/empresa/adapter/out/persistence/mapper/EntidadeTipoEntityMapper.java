package br.com.wassistemas.tasko.empresa.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.EntidadeTipoEntity;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EntidadeTipoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    EntidadeTipo toDomain(EntidadeTipoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    EntidadeTipoEntity toEntity(AdicionarEntidadeTipo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    EntidadeTipoEntity toEntity(Long id, AtualizarEntidadeTipo domain);
}
