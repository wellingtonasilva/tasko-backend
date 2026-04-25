package br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "forma_pagamento", schema = "crm")
@Data
@NoArgsConstructor
public class FormaPagamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fpag_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "fpag_dsforma_pagamento")
    private String descricaoFormaPagamento;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "fpag_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "fpag_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "fpag_icativo"))
    private AuditoriaEntity auditoria;
}
