package br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByNomeUsuarioAndSenha(String nomeUsuario, String senha);
}

