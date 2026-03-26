package br.com.wasistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoRequest;
import br.com.wasistemas.tasko.produto.domain.produto.AdicionarProduto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoWebMapper {
    AdicionarProduto toDomain(AdicionarProdutoRequest request);
}
