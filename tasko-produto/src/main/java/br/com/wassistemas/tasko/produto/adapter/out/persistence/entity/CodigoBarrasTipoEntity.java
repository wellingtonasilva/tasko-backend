package br.com.wassistemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "codigo_barras_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class CodigoBarrasTipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cbtp_id")
    private Long id;

    @Column(name = "cbtp_nmtipo")
    private String nomeTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "cbtp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "cbtp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "cbtp_icativo"))
    private AuditoriaEntity auditoria;
}
