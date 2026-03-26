package br.com.wasistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoGrupoRequest;
import br.com.wasistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoGrupoWebMapper {
    AdicionarProdutoGrupo toDomain(AdicionarProdutoGrupoRequest request);
}
