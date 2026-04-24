package br.com.wassistemas.tasko.empresa.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.LocalizacaoTipoEntity;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocalizacaoTipoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    LocalizacaoTipo toDomain(LocalizacaoTipoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    LocalizacaoTipoEntity toEntity(AdicionarLocalizacaoTipo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    LocalizacaoTipoEntity toEntity(Long id, AtualizarLocalizacaoTipo domain);
}
