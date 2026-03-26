package br.com.wasistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoUnidadeMedidaRequest;
import br.com.wasistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoUnidadeMedidaWebMapper {
    AdicionarProdutoUnidadeMedida toDomain(AdicionarProdutoUnidadeMedidaRequest request);
}
