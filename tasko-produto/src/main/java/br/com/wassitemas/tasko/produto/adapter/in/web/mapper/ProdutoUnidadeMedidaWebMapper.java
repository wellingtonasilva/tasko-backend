package br.com.wassitemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassitemas.tasko.produto.adapter.in.web.request.AdicionarProdutoUnidadeMedidaRequest;
import br.com.wassitemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoUnidadeMedidaWebMapper {
    AdicionarProdutoUnidadeMedida toDomain(AdicionarProdutoUnidadeMedidaRequest request);
}
