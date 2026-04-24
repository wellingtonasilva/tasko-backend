package br.com.wassitemas.tasko.produto.domain.produtopreco;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class ProdutoPreco {
    private Long id;
    private Long produtoId;
    private Long tabelaPrecoId;
    private BigDecimal preco;
    private BigDecimal descontoMaximo;
    private Auditoria auditoria;
}
