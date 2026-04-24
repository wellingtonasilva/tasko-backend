package br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "tabela_preco", schema = "crm")
@Data
@NoArgsConstructor
public class TabelaPrecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tpre_id")
    private Long id;

    @Column(name = "tapc_id")
    private Long tabelaPrecoTipoId;

    @Column(name = "tpre_nmtabela_preco")
    private String nomeTabelaPreco;

    @Column(name = "tpre_dstabela_preco")
    private String descricaoTabelaPreco;

    @Column(name = "tpre_dtinicio")
    private LocalDate dataInicio;

    @Column(name = "tpre_dtfim")
    private LocalDate dataFim;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "tpre_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "tpre_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "tpre_icativo"))
    private AuditoriaEntity auditoria;
}
