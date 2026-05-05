package br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections.UsuarioDetalhadoProjection;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections.UsuarioPerfilProjection;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

  @EntityGraph(value = "UsuarioEntity.comDetalhes", type = EntityGraph.EntityGraphType.LOAD)
  Optional<UsuarioEntity> findByNomeUsuario(String nomeUsuario);

  @Modifying
  @Query("UPDATE UsuarioEntity SET senha = :senha, auditoria.atualizadoEm = :atualizadoEm WHERE id = :id")
  void atualizarSenha(Long id, String senha, LocalDateTime atualizadoEm);

  @Modifying
  @Query("""
      UPDATE UsuarioEntity SET vendedorId = :vendedorId, nomeCompleto = :nomeCompleto,
          numeroTelefone = :numeroTelefone,  auditoria.atualizadoEm = :atualizadoEm,
              auditoria.atualizadoEm = :indicadorAtivo WHERE id = :id
      """)
  void atualizarUsuario(Long id, Long vendedorId, String nomeCompleto, String numeroTelefone,
      boolean indicadorAtivo, LocalDateTime atualizadoEm);

  @Query("""
          SELECT DISTINCT u
          FROM UsuarioEntity u
          JOIN u.empresas ue
          WHERE ue.empresaId = :empresaId
      """)
  Page<UsuarioEntity> findByEmpresaId(Long empresaId, Pageable pageable);

   @EntityGraph(value = "UsuarioEntity.comDetalhes", type = EntityGraph.EntityGraphType.LOAD)
   @Query("""
           SELECT DISTINCT u
           FROM UsuarioEntity u
           WHERE u.id = :id
       """)
   Optional<UsuarioEntity> findDetalhadoById(Long id);

  @Query("""
      SELECT u.id AS id,
             u.nomeUsuario AS nomeUsuario,
             u.auditoria.criadoEm AS criadoEm,
             u.auditoria.atualizadoEm AS atualizadoEm,
             u.auditoria.indicadorAtivo AS indicadorAtivo,
             v.id AS vendedorId,
             v.codigoVendedor AS vendedorCodigo,
             v.nomeVendedor AS vendedorNome,
             v.numeroCPF AS vendedorCpf,
             v.email AS vendedorEmail,
             v.numeroTelefone AS vendedorTelefone
      FROM UsuarioEntity u
      LEFT JOIN u.vendedor v
      WHERE u.id = :id
      """)
  Optional<UsuarioDetalhadoProjection> findDetalhadoProjectionById(Long id);

  @Query("""
      SELECT p.id AS id,
             pt.id AS perfilTipoId,
             p.auditoria.criadoEm AS criadoEm,
             p.auditoria.atualizadoEm AS atualizadoEm,
             p.auditoria.indicadorAtivo AS indicadorAtivo
      FROM UsuarioPerfilEntity p
      JOIN p.perfilTipo pt
      WHERE p.usuario.id = :usuarioId
      ORDER BY p.id
      """)
  List<UsuarioPerfilProjection> findPerfisProjectionByUsuarioId(Long usuarioId);
}
