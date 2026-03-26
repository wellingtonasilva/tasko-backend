package br.com.wasistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoCodigoBarrasRequest;
import br.com.wasistemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoCodigoBarrasWebMapper {
    AdicionarProdutoCodigoBarras toDomain(AdicionarProdutoCodigoBarrasRequest request);
}
