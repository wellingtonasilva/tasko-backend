package br.com.wassistemas.tasko.produto.domain.produtocodigobarras;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarProdutoCodigoBarras {
    Long id;
    Long produtoId;
    Long codigoBarrasTipoId;
    String codigoBarras;
    Boolean principal;
}
