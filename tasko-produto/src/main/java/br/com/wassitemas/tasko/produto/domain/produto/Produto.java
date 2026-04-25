package br.com.wassitemas.tasko.produto.domain.produto;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class Produto {
    private Long id;
    private Long empresaId;
    private String nomeProduto;
    private String descricaoProduto;
    private Long unidadeMedidaId;
    private Long grupoId;
    private Long subgrupoId;
    private BigDecimal pesoLiquido;
    private String marca;
    private String fornecedor;
    private BigDecimal aliquotaIcms;
    private BigDecimal aliquotaIpi;
    private BigDecimal dimensaoAltura;
    private BigDecimal dimensaoLargura;
    private BigDecimal dimensaoProfundidade;
    private BigDecimal precoCusto;
    private BigDecimal precoSugerido;
    private BigDecimal margemMinima;
    private BigDecimal quantidadeDisponivel;
    private BigDecimal quantidadeReservada;
    private Auditoria auditoria;
}
