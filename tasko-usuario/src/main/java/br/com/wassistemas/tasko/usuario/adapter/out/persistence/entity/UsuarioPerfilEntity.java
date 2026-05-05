package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_perfil", schema = "crm")
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "usuario")
public class UsuarioPerfilEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uspf_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "uspt_id", foreignKey = @ForeignKey(name = "xfk2_usuario_perfil"))
    private UsuarioPerfilTipoEntity perfilTipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usur_id")
    private UsuarioEntity usuario;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "usur_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usur_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usur_icativo"))
    private AuditoriaEntity auditoria;
}