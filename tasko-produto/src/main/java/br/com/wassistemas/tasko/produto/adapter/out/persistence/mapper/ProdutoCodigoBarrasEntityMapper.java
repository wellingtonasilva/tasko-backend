package br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoCodigoBarrasEntity;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.AtualizarProdutoCodigoBarras;
import br.com.wassistemas.tasko.produto.domain.produtocodigobarras.ProdutoCodigoBarras;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoCodigoBarrasEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    ProdutoCodigoBarras toDomain(ProdutoCodigoBarrasEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ProdutoCodigoBarrasEntity toEntity(AdicionarProdutoCodigoBarras domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ProdutoCodigoBarrasEntity toEntity(Long id, AtualizarProdutoCodigoBarras domain);
}
