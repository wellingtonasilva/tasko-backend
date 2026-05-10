package br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.projections.ProdutoProjection;
import br.com.wassistemas.tasko.produto.domain.produto.AdicionarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.AtualizarProduto;
import br.com.wassistemas.tasko.produto.domain.produto.Produto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    Produto toDomain(ProdutoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ProdutoEntity toEntity(AdicionarProduto domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ProdutoEntity toEntity(Long id, AtualizarProduto domain);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateProdutoEntity(AtualizarProduto domain, @MappingTarget ProdutoEntity entity);

    Produto toDomain(ProdutoProjection projection);
}
