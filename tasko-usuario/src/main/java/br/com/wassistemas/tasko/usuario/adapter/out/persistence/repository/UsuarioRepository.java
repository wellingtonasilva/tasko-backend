package br.com.wassistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    @Query("SELECT u FROM UsuarioEntity u LEFT JOIN FETCH u.empresas WHERE u.nomeUsuario = :nomeUsuario")
    Optional<UsuarioEntity> findByNomeUsuario(String nomeUsuario);
}