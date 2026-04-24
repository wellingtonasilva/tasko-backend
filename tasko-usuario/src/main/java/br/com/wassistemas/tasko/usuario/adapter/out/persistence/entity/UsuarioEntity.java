package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorEntity;
import jakarta.persistence.*;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario", schema = "crm")
@Data
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usur_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vend_id", foreignKey = @ForeignKey(name = "xkf1_usuario_vendedor"))
    private VendedorEntity vendedor;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<UsuarioPerfilEntity> perfis;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<UsuarioEmpresaEntity> empresas;

    @Column(name = "usur_nmusuario")
    private String nomeUsuario;

    @Column(name = "usur_dssenha")
    private String senha;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "usur_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usur_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usur_icativo"))
    private AuditoriaEntity auditoria;
}