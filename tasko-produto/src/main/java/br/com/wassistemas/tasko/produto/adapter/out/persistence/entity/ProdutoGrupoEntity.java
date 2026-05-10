package br.com.wassistemas.tasko.produto.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "produto_grupo", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ProdutoGrupoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "grup_id")
  private Long id;

  @Column(name = "emp_id")
  private Long empresaId;

  @Column(name = "grup_dsgrupo")
  private String descricaoGrupo;

  @Embedded
  @AttributeOverride(name = "criadoEm", column = @Column(name = "grup_tmcriado_em"))
  @AttributeOverride(name = "atualizadoEm", column = @Column(name = "grup_tmatualizado_em"))
  @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "grup_icativo"))
  private AuditoriaEntity auditoria;
}
