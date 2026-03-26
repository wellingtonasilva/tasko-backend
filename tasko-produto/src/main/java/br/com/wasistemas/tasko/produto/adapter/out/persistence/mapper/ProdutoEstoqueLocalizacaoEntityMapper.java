package br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEstoqueLocalizacaoEntity;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.AtualizarProdutoEstoqueLocalizacao;
import br.com.wasistemas.tasko.produto.domain.produtoestoque.ProdutoEstoqueLocalizacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoEstoqueLocalizacaoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    ProdutoEstoqueLocalizacao toDomain(ProdutoEstoqueLocalizacaoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ProdutoEstoqueLocalizacaoEntity toEntity(AdicionarProdutoEstoqueLocalizacao domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ProdutoEstoqueLocalizacaoEntity toEntity(Long id, AtualizarProdutoEstoqueLocalizacao domain);
}
