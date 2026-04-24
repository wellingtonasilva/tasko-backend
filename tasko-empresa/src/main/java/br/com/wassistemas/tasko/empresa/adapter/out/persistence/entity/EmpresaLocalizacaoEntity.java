package br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "empresa_localizacao", schema = "crm")
@Data
@NoArgsConstructor
public class EmpresaLocalizacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emlc_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "emlc_nmlocalizacao")
    private String nomeLocalizacao;

    @Column(name = "lctp_id")
    private Long localizacaoTipoId;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "emlc_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "emlc_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "emlc_icativo"))
    private AuditoriaEntity auditoria;
}
