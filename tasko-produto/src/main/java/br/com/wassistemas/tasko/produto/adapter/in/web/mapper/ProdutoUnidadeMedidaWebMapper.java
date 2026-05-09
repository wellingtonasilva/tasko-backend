package br.com.wassistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoUnidadeMedidaRequest;
import br.com.wassistemas.tasko.produto.adapter.in.web.response.ProdutoUnidadeMedidaResponse;
import br.com.wassistemas.tasko.produto.domain.unidademedida.AdicionarProdutoUnidadeMedida;
import br.com.wassistemas.tasko.produto.domain.unidademedida.ProdutoUnidadeMedida;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoUnidadeMedidaWebMapper {
    AdicionarProdutoUnidadeMedida toDomain(AdicionarProdutoUnidadeMedidaRequest request);
    ProdutoUnidadeMedidaResponse toResponse(ProdutoUnidadeMedida domain);
    List<ProdutoUnidadeMedidaResponse> toList(List<ProdutoUnidadeMedida> domainList);
}
