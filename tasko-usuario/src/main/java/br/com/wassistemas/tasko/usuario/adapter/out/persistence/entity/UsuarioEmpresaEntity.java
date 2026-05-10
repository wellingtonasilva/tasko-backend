package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "usuario_empresa", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class UsuarioEmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usem_id")
    private Long id;

    @Column(name = "usur_id")
    private Long usuarioId;

    @Column(name = "emp_id")
    private Long empresaId;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "usem_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usem_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usem_icativo"))
    private AuditoriaEntity auditoria;
}
