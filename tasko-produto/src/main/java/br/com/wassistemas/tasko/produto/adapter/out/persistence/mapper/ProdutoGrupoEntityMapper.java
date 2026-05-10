package br.com.wassistemas.tasko.produto.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.produto.adapter.out.persistence.entity.ProdutoGrupoEntity;
import br.com.wassistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoGrupoEntityMapper {

  Auditoria toDomain(AuditoriaEntity entity);

  ProdutoGrupo toDomain(ProdutoGrupoEntity entity);

  @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "id", ignore = true)
  ProdutoGrupoEntity toEntity(AdicionarProdutoGrupo domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  ProdutoGrupoEntity toEntity(Long id, AtualizarProdutoGrupo domain);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  void updateProdutoGrupoEntity(
      AtualizarProdutoGrupo domain, @MappingTarget ProdutoGrupoEntity entity);
}
