package br.com.wassitemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassitemas.tasko.produto.adapter.in.web.request.AdicionarProdutoEstoqueLocalizacaoRequest;
import br.com.wassitemas.tasko.produto.domain.produtoestoque.AdicionarProdutoEstoqueLocalizacao;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoEstoqueLocalizacaoWebMapper {
    AdicionarProdutoEstoqueLocalizacao toDomain(AdicionarProdutoEstoqueLocalizacaoRequest request);
}
