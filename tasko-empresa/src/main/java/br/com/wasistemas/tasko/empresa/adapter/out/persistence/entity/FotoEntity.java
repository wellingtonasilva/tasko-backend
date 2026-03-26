package br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "fotos", schema = "crm")
@Data
@NoArgsConstructor
public class FotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foto_id")
    private Long id;

    @Column(name = "entp_id")
    private Long entidadeTipoId;

    @Column(name = "vend_id")
    private Long vendedorId;

    @Column(name = "foto_nmarquivo")
    private String nomeArquivo;

    @Column(name = "foto_path")
    private String path;

    @Column(name = "foto_vllatitude")
    private BigDecimal latitude;

    @Column(name = "foto_vllongitude")
    private BigDecimal longitude;

    @Column(name = "foto_icsincronizado")
    private Boolean sincronizado;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "foto_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "foto_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "foto_icativo"))
    private AuditoriaEntity auditoria;
}
