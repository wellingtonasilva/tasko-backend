package br.com.wassitemas.tasko.produto.domain.produtopreco;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class AdicionarProdutoPreco {
    Long produtoId;
    Long tabelaPrecoId;
    BigDecimal preco;
    BigDecimal descontoMaximo;
}
