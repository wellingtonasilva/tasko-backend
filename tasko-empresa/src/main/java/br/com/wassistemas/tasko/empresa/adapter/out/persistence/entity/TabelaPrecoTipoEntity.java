package br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tabela_preco_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class TabelaPrecoTipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tapc_id")
    private Long id;

    @Column(name = "tapc_dstabela_preco_tipo")
    private String descricaoTabelaPrecoTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "tapc_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "tapc_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "tapc_icativo"))
    private AuditoriaEntity auditoria;
}
