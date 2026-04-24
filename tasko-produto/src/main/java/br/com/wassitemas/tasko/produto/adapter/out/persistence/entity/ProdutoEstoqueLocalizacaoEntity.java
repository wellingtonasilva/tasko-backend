package br.com.wassitemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "produto_estoque_localizacao", schema = "crm")
@Data
@NoArgsConstructor
public class ProdutoEstoqueLocalizacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prel_id")
    private Long id;

    @Column(name = "prod_id")
    private Long produtoId;

    @Column(name = "emlc_id")
    private Long empresaLocalizacaoId;

    @Column(name = "prel_cdlocalizacao_fisica")
    private String localizacaoFisica;

    @Column(name = "prel_qtd_disponivel")
    private BigDecimal quantidadeDisponivel;

    @Column(name = "prel_qtd_reservada")
    private BigDecimal quantidadeReservada;

    @Column(name = "prel_nnlote")
    private String lote;

    @Column(name = "prel_dtvalidade")
    private LocalDate dataValidade;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "prel_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "prel_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "prel_icativo"))
    private AuditoriaEntity auditoria;
}
