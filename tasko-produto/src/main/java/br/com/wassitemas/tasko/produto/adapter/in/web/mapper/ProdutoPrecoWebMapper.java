package br.com.wassitemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassitemas.tasko.produto.adapter.in.web.request.AdicionarProdutoPrecoRequest;
import br.com.wassitemas.tasko.produto.domain.produtopreco.AdicionarProdutoPreco;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoPrecoWebMapper {
    AdicionarProdutoPreco toDomain(AdicionarProdutoPrecoRequest request);
}
