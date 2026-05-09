package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "vendedor_supervisor", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class VendedorSupervisorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supv_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "supv_nmsupervisor")
    private String nomeSupervisor;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "supv_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "supv_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "supv_icativo"))
    private AuditoriaEntity auditoria;

    @PrePersist
    public void prePersist() {
        if (auditoria == null) {
            auditoria = new AuditoriaEntity();
        }
    }
}