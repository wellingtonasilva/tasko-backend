package br.com.wassitemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "produto_unidade_medida", schema = "crm")
@Data
@NoArgsConstructor
public class ProdutoUnidadeMedidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unmd_id")
    private Long id;

    @Column(name = "unmd_dsunidade_medida")
    private String descricaoUnidadeMedida;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "unmd_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "unmd_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "unmd_icativo"))
    private AuditoriaEntity auditoria;
}
