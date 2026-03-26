package br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoUnidadeMedidaEntity;
import br.com.wasistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.AtualizarProdutoUnidadeMedida;
import br.com.wasistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoUnidadeMedidaEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    ProdutoUnidadeMedida toDomain(ProdutoUnidadeMedidaEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ProdutoUnidadeMedidaEntity toEntity(AdicionarProdutoUnidadeMedida domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ProdutoUnidadeMedidaEntity toEntity(Long id, AtualizarProdutoUnidadeMedida domain);
}
