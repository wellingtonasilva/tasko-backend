package br.com.wassistemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "produto_subgrupo", schema = "crm")
@Data
@NoArgsConstructor
public class ProdutoSubgrupoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subg_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "subg_dssubgrupo")
    private String descricaoSubgrupo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "subg_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "subg_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "subg_icativo"))
    private AuditoriaEntity auditoria;
}
