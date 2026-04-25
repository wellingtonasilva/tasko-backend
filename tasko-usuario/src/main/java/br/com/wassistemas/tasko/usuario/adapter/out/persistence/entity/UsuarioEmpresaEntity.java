package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_empresa", schema = "crm")
@Data
@NoArgsConstructor
public class UsuarioEmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usem_id")
    private Long id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "usur_id", foreignKey = @ForeignKey(name = "xfk2_usuario_empresa"))
    private UsuarioEntity usuario;

    @Column(name = "emp_id")
    private Long empresaId;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "usem_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usem_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usem_icativo"))
    private AuditoriaEntity auditoria;
}
