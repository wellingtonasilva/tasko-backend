package br.com.wasistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.produto.adapter.out.persistence.entity.ProdutoSubgrupoEntity;
import br.com.wasistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.AtualizarProdutoSubgrupo;
import br.com.wasistemas.tasko.produto.domain.subgrupo.ProdutoSubgrupo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoSubgrupoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    ProdutoSubgrupo toDomain(ProdutoSubgrupoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ProdutoSubgrupoEntity toEntity(AdicionarProdutoSubgrupo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ProdutoSubgrupoEntity toEntity(Long id, AtualizarProdutoSubgrupo domain);
}
