package br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoPrecoEntity;
import br.com.wasistemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import br.com.wasistemas.tasko.produto.domain.produtopreco.AtualizarProdutoPreco;
import br.com.wasistemas.tasko.produto.domain.produtopreco.ProdutoPreco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoPrecoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    ProdutoPreco toDomain(ProdutoPrecoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ProdutoPrecoEntity toEntity(AdicionarProdutoPreco domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ProdutoPrecoEntity toEntity(Long id, AtualizarProdutoPreco domain);
}
