package br.com.wassistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoGrupoRequest;
import br.com.wassistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoGrupoWebMapper {
    AdicionarProdutoGrupo toDomain(Long empresaId, AdicionarProdutoGrupoRequest request);
}
