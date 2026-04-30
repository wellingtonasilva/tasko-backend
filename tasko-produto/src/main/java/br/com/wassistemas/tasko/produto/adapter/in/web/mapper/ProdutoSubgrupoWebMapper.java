package br.com.wassistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoSubgrupoRequest;
import br.com.wassistemas.tasko.produto.domain.subgrupo.AdicionarProdutoSubgrupo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoSubgrupoWebMapper {
    AdicionarProdutoSubgrupo toDomain(Long empresaId, AdicionarProdutoSubgrupoRequest request);
}
