package br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "localizacao_tipo", schema = "crm")
@Data
@NoArgsConstructor
public class LocalizacaoTipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lctp_id")
    private Long id;

    @Column(name = "lctp_dslocalizacao_tipo")
    private String descricaoLocalizacaoTipo;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "lctp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "lctp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "lctp_icativo"))
    private AuditoriaEntity auditoria;
}
