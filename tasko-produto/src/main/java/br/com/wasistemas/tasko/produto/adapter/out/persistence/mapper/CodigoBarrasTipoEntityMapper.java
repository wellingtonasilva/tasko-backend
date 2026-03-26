package br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.CodigoBarrasTipoEntity;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CodigoBarrasTipoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    CodigoBarrasTipo toDomain(CodigoBarrasTipoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    CodigoBarrasTipoEntity toEntity(AdicionarCodigoBarrasTipo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    CodigoBarrasTipoEntity toEntity(Long id, AtualizarCodigoBarrasTipo domain);
}
