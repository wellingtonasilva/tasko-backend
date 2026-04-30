package br.com.wassistemas.tasko.produto.domain.produtopreco;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;

@Value
@Builder
@Getter
public class AtualizarProdutoPreco {
    Long id;
    Long produtoId;
    Long tabelaPrecoId;
    BigDecimal preco;
    BigDecimal descontoMaximo;
}
