package br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

  Optional<UsuarioEntity> findByNomeUsuario(String nomeUsuario);

  @Modifying
  @Query("UPDATE UsuarioEntity SET senha = :senha, auditoria.atualizadoEm = :atualizadoEm WHERE id = :id")
  void atualizarSenha(Long id, String senha, LocalDateTime atualizadoEm);

  @Modifying
  @Query("""
      UPDATE UsuarioEntity SET vendedorId = :vendedorId, nomeCompleto = :nomeCompleto,
          numeroTelefone = :numeroTelefone,  auditoria.atualizadoEm = :atualizadoEm,
              auditoria.indicadorAtivo = :indicadorAtivo WHERE id = :id
      """)
  void atualizarUsuario(Long id, Long vendedorId, String nomeCompleto, String numeroTelefone,
      boolean indicadorAtivo, LocalDateTime atualizadoEm);

  @Query("SELECT u FROM UsuarioEntity u WHERE u.id IN (SELECT v.id FROM UsuarioEmpresaEntity v WHERE v.id = :empresaId)")
  Page<UsuarioEntity> findByEmpresaId(Long empresaId, Pageable pageable);

  Optional<UsuarioEntity> findDetalhadoById(Long id);
}
