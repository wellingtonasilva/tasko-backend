package br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity.TabelaPrecoTipoEntity;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TabelaPrecoTipoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    TabelaPrecoTipo toDomain(TabelaPrecoTipoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    TabelaPrecoTipoEntity toEntity(AdicionarTabelaPrecoTipo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    TabelaPrecoTipoEntity toEntity(Long id, AtualizarTabelaPrecoTipo domain);
}
