package br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "condicao_pagamento", schema = "crm")
@Data
@NoArgsConstructor
public class CondicaoPagamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cndp_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "cndp_dscondicao_pagamento")
    private String descricaoCondicaoPagamento;

    @Column(name = "cndp_condicao_pagamento")
    private String condicaoPagamento;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "cndp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "cndp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "cndp_icativo"))
    private AuditoriaEntity auditoria;
}
