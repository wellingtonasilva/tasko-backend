package br.com.wasistemas.tasko.produto.domain.produtoestoque;

import lombok.Value;
import java.math.BigDecimal;
import java.time.LocalDate;

@Value
public class AdicionarProdutoEstoqueLocalizacao {
    Long produtoId;
    Long empresaLocalizacaoId;
    String localizacaoFisica;
    BigDecimal quantidadeDisponivel;
    BigDecimal quantidadeReservada;
    String lote;
    LocalDate dataValidade;
}
