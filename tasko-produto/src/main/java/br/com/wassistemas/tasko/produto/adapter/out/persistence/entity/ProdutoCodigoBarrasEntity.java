package br.com.wassistemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "produto_codigo_barras", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ProdutoCodigoBarrasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prcb_id")
    private Long id;

    @Column(name = "prod_id")
    private Long produtoId;

    @Column(name = "cbtp_id")
    private Long codigoBarrasTipoId;

    @Column(name = "prcb_cdbarras")
    private String codigoBarras;

    @Column(name = "prcb_icprincipal")
    private Boolean principal;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "prcb_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "prcb_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "prcb_icativo"))
    private AuditoriaEntity auditoria;
}
