package br.com.wassistemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "produto_precos", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ProdutoPrecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prdp_id")
    private Long id;

    @Column(name = "prod_id")
    private Long produtoId;

    @Column(name = "tpre_id")
    private Long tabelaPrecoId;

    @Column(name = "prdp_vlpreco")
    private BigDecimal preco;

    @Column(name = "prdp_per_desconto_maximo")
    private BigDecimal descontoMaximo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "prdp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "prdp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "prdp_icativo"))
    private AuditoriaEntity auditoria;
}
