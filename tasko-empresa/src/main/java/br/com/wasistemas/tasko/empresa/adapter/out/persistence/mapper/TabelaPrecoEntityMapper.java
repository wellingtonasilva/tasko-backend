package br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity.TabelaPrecoEntity;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.AtualizarTabelaPreco;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TabelaPrecoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    TabelaPreco toDomain(TabelaPrecoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    TabelaPrecoEntity toEntity(AdicionarTabelaPreco domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    TabelaPrecoEntity toEntity(Long id, AtualizarTabelaPreco domain);
}
