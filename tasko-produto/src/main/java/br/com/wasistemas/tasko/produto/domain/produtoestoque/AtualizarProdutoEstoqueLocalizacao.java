package br.com.wasistemas.tasko.produto.domain.produtoestoque;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;
import java.time.LocalDate;

@Value
@Builder
@Getter
public class AtualizarProdutoEstoqueLocalizacao {
    Long id;
    Long produtoId;
    Long empresaLocalizacaoId;
    String localizacaoFisica;
    BigDecimal quantidadeDisponivel;
    BigDecimal quantidadeReservada;
    String lote;
    LocalDate dataValidade;
}
