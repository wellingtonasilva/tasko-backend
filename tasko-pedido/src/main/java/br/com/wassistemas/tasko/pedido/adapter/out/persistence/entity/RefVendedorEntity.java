package br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "vendedor", schema = "crm")
@Data
@NoArgsConstructor
public class RefVendedorEntity {
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
}