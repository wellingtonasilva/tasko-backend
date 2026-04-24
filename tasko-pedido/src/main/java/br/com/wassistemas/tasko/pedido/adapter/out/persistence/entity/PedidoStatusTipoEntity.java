package br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "pedido_status_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class PedidoStatusTipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pstp_id")
    private Long id;

    @Column(name = "pstp_dsstatus_tipo")
    private String descricaoStatusTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "pstp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "pstp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "pstp_icativo"))
    private AuditoriaEntity auditoria;
}
