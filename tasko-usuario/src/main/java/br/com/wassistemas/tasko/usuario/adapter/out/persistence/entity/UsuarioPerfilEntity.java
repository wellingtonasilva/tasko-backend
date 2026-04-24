package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_perfil", schema = "crm")
@Data
@NoArgsConstructor
public class UsuarioPerfilEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uspf_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "uspt_id", foreignKey = @ForeignKey(name = "xfk2_usuario_perfil"))
    private UsuarioPerfilTipoEntity perfilTipo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "usur_id", foreignKey = @ForeignKey(name = "xfk1_usuario_perfil"))
    private UsuarioEntity usuario;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "usur_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usur_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usur_icativo"))
    private AuditoriaEntity auditoria;
}