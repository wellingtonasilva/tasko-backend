package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendedor_supervisor", schema = "crm")
@Data
@NoArgsConstructor
public class VendedorSupervisorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supv_id")
    private Long id;

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