package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario", schema = "crm")
@NamedEntityGraph(
    name = "UsuarioEntity.comDetalhes",
    attributeNodes = {
        @NamedAttributeNode("vendedor"),
        @NamedAttributeNode("perfis"),
        @NamedAttributeNode("empresas")
    }
)
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"perfis", "empresas"})
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usur_id")
    private Long id;

    @Column(name = "vend_id")
    private Long vendedorId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vend_id", referencedColumnName = "vend_id", insertable = false, updatable = false)
    private VendedorRefEntity vendedor;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UsuarioPerfilEntity> perfis;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UsuarioEmpresaEntity> empresas;

    @Column(name = "usur_nmusuario")
    private String nomeUsuario;

    @Column(name = "usur_nmcompleto")
    private String nomeCompleto;

    @Column(name = "usur_nmtelefone")
    private String numeroTelefone;

    @Column(name = "usur_dssenha")
    private String senha;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "usur_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usur_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usur_icativo"))
    private AuditoriaEntity auditoria;
}