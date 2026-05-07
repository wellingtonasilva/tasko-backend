package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "vendedor", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class VendedorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vend_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "vend_cdvendedor")
    private String codigoVendedor;

    @Column(name = "vend_nmvendedor")
    private String nomeVendedor;

    @Column(name = "vend_nncpf")
    private String numeroCPF;

    @Column(name = "vend_dsemail")
    private String email;

    @Column(name = "vend_nntelefone")
    private String numeroTelefone;

    @Column(name = "vend_vlmeta_mensal")
    private BigDecimal valorMetaMensal;

    @Column(name = "vend_per_comissao")
    private BigDecimal percentualComissao;

    @Column(name = "vend_tmultimo_sincronizmo")
    private LocalDateTime ultimoSincronismo;

    @Column(name = "vend_cddisposito")
    private String codigoDispositivo;

    @ManyToOne
    @JoinColumn(name = "supv_id", foreignKey = @ForeignKey(name = "xfk1_vendedor"))
    private VendedorSupervisorEntity supervisor;

    @ManyToOne
    @JoinColumn(name = "vter_id", foreignKey = @ForeignKey(name = "xfk2_vendedor"))
    private VendedorTerritorioEntity territorio;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "vend_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "vend_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "vend_icativo"))
    private AuditoriaEntity auditoria;
}