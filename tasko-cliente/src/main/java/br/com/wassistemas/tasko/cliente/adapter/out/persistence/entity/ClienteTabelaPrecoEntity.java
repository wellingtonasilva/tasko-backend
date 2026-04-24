package br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "cliente_tabela_preco", schema = "crm")
@Data
@NoArgsConstructor
public class ClienteTabelaPrecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cltb_id")
    private Long id;

    @Column(name = "clie_id")
    private Long clienteId;

    @Column(name = "tpre_id")
    private Long tabelaPrecoId;

    @Column(name = "cltb_dtinicio")
    private LocalDate dataInicio;

    @Column(name = "cltb_dtfim")
    private LocalDate dataFim;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "cltb_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "cltb_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "cltb_icativo"))
    private AuditoriaEntity auditoria;
}

