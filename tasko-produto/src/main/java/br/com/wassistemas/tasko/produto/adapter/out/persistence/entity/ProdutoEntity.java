package br.com.wassistemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "produto", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "prod_nmproduto")
    private String nomeProduto;

    @Column(name = "prod_dsproduto")
    private String descricaoProduto;

    @Column(name = "unmd_id")
    private Long unidadeMedidaId;

    @Column(name = "grup_id")
    private Long grupoId;

    @Column(name = "subg_id")
    private Long subgrupoId;

    @Column(name = "prod_nnpeso_liquido")
    private BigDecimal pesoLiquido;

    @Column(name = "prod_nmmarca")
    private String marca;

    @Column(name = "prod_nmfornecedor")
    private String fornecedor;

    @Column(name = "prod_per_aliquota_icms")
    private BigDecimal aliquotaIcms;

    @Column(name = "prod_per_aliquota_ipi")
    private BigDecimal aliquotaIpi;

    @Column(name = "prod_dimesao_altura")
    private BigDecimal dimensaoAltura;

    @Column(name = "prod_dimesao_largura")
    private BigDecimal dimensaoLargura;

    @Column(name = "prod_dimesao_profundidade")
    private BigDecimal dimensaoProfundidade;

    @Column(name = "prod_vlpreco_custo")
    private BigDecimal precoCusto;

    @Column(name = "prod_vlpreco_sugerido")
    private BigDecimal precoSugerido;

    @Column(name = "prod_vlmargem_minima")
    private BigDecimal margemMinima;

    @Column(name = "prod_qtd_disponivel")
    private BigDecimal quantidadeDisponivel;

    @Column(name = "prod_qtd_reservada")
    private BigDecimal quantidadeReservada;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "prod_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "prod_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "prod_icativo"))
    private AuditoriaEntity auditoria;
}
