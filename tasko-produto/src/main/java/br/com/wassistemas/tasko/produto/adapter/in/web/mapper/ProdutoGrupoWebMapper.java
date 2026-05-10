package br.com.wassistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wassistemas.tasko.produto.adapter.in.web.request.AdicionarProdutoGrupoRequest;
import br.com.wassistemas.tasko.produto.adapter.in.web.request.AtualizarProdutoGrupoRequest;
import br.com.wassistemas.tasko.produto.adapter.in.web.response.ProdutoGrupoResponse;
import br.com.wassistemas.tasko.produto.domain.grupo.AdicionarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.AtualizarProdutoGrupo;
import br.com.wassistemas.tasko.produto.domain.grupo.ProdutoGrupo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutoGrupoWebMapper {
    AdicionarProdutoGrupo toDomain(Long empresaId, AdicionarProdutoGrupoRequest request);
    AtualizarProdutoGrupo toDomain(AtualizarProdutoGrupoRequest request);
    ProdutoGrupoResponse toResponse(ProdutoGrupo domain);
    List<ProdutoGrupoResponse> toList(List<ProdutoGrupo> list);
}
