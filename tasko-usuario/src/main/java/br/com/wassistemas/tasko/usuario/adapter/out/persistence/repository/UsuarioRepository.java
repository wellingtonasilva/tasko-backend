package br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections.UsuarioLoginProjection;
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

  @Query("SELECT u FROM UsuarioEntity u WHERE u.id IN (SELECT v.usuarioId FROM UsuarioEmpresaEntity v WHERE v.empresaId = :empresaId)")
  Page<UsuarioEntity> findByEmpresaId(Long empresaId, Pageable pageable);

  Optional<UsuarioEntity> findDetalhadoById(Long id);

  @Query("""
    SELECT
      u.id as id,
      u.nomeUsuario as nomeUsuario,
      u.auditoria.criadoEm as criadoEm,
      u.auditoria.atualizadoEm as atualizadoEm,
      u.auditoria.indicadorAtivo as indicadorAtivo,
      u.vendedorId as vendedorId,
      v.codigoVendedor as vendedorCodigo,
      v.nomeVendedor as vendedorNome,
      v.numeroCPF as vendedorCpf,
      v.email as vendedorEmail,
      v.numeroTelefone as vendedorTelefone,
      u.nomeCompleto as nomeCompleto,
      u.numeroTelefone as numeroTelefone,
      u.senha as senha
    FROM UsuarioEntity u
    LEFT JOIN VendedorRefEntity v ON u.vendedorId = v.id
    WHERE u.nomeUsuario = :nomeUsuario
  """)
  Optional<UsuarioLoginProjection> findByNomeUsuario(String nomeUsuario);
}