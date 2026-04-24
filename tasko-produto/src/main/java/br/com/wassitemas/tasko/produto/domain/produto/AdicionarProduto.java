package br.com.wassitemas.tasko.produto.domain.produto;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class AdicionarProduto {
    String nomeProduto;
    String descricaoProduto;
    Long unidadeMedidaId;
    Long grupoId;
    Long subgrupoId;
    BigDecimal pesoLiquido;
    String marca;
    String fornecedor;
    BigDecimal aliquotaIcms;
    BigDecimal aliquotaIpi;
    BigDecimal dimensaoAltura;
    BigDecimal dimensaoLargura;
    BigDecimal dimensaoProfundidade;
    BigDecimal precoCusto;
    BigDecimal precoSugerido;
    BigDecimal margemMinima;
    BigDecimal quantidadeDisponivel;
    BigDecimal quantidadeReservada;
}
