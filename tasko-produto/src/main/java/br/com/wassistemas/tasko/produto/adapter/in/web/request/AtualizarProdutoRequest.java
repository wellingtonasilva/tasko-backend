package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AtualizarProdutoRequest {
    Long id;
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
