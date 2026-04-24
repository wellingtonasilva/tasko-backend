package br.com.wassitemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassitemas.tasko.produto.adapter.in.web.request.AdicionarProdutoCodigoBarrasRequest;
import br.com.wassitemas.tasko.produto.domain.produtocodigobarras.AdicionarProdutoCodigoBarras;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoCodigoBarrasWebMapper {
    AdicionarProdutoCodigoBarras toDomain(AdicionarProdutoCodigoBarrasRequest request);
}
