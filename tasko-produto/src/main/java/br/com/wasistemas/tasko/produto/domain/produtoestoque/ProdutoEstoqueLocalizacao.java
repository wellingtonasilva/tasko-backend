package br.com.wasistemas.tasko.produto.domain.produtoestoque;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class ProdutoEstoqueLocalizacao {
    private Long id;
    private Long produtoId;
    private Long empresaLocalizacaoId;
    private String localizacaoFisica;
    private BigDecimal quantidadeDisponivel;
    private BigDecimal quantidadeReservada;
    private String lote;
    private LocalDate dataValidade;
    private Auditoria auditoria;
}
