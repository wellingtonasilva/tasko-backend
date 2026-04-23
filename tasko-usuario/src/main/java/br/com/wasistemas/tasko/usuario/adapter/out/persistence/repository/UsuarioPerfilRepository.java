package br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPerfilRepository extends JpaRepository<UsuarioPerfilEntity, Long> {
    // Métodos customizados podem ser adicionados aqui
}

