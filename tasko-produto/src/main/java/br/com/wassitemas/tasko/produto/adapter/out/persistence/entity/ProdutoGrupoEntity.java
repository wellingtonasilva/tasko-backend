package br.com.wassitemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "produto_grupo", schema = "crm")
@Data
@NoArgsConstructor
public class ProdutoGrupoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grup_id")
    private Long id;

    @Column(name = "grup_dsgrupo")
    private String descricaoGrupo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "grup_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "grup_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "grup_icativo"))
    private AuditoriaEntity auditoria;
}
