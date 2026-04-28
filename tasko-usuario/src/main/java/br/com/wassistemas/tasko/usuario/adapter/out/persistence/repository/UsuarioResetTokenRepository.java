package br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioResetTokenEntity;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioResetTokenRepository extends JpaRepository<UsuarioResetTokenEntity, Long> {

  @Modifying
  @Query("UPDATE UsuarioResetTokenEntity SET utilizado =:utilizado, auditoria.atualizadoEm =:atualizadoEm WHERE id = :id")
  void atualizarUsuarioResetToken(Long usuarioId, Boolean utilizado, LocalDateTime atualizadoEm);

  Optional<UsuarioResetTokenEntity> findByToken(String token);
}