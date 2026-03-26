package br.com.wasistemas.tasko.produto.domain.produtocodigobarras;

import lombok.Value;


@Value
public class AdicionarProdutoCodigoBarras {
    Long produtoId;
    Long codigoBarrasTipoId;
    String codigoBarras;
    Boolean principal;
}
