package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_reset_senha", schema = "crm")
@Data
@NoArgsConstructor
public class UsuarioResetTokenEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "usrs_id")
  private Long id;

  @Column(name = "usrs_dsemail")
  private String email;

  @Column(name = "usrs_token")
  private String token;

  @Column(name = "usrs_tmvalido_ate")
  private LocalDateTime validoAte;

  @Column(name = "usrs_icutilizado")
  private Boolean utilizado;

  @Embedded
  @AttributeOverride(name = "criadoEm", column = @Column(name = "usrs_tmcriado_em"))
  @AttributeOverride(name = "atualizadoEm", column = @Column(name = "usrs_tmatualizado_em"))
  @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "usrs_icativo"))
  private AuditoriaEntity auditoria;
}