package br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_perfil_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class UsuarioPerfilTipoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uspt_id")
    private Long id;

    @Column(name = "uspt_nmperfil")
    private String descricaoPerfilTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "uspt_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "uspt_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "uspt_icativo"))
    private AuditoriaEntity auditoria;
}