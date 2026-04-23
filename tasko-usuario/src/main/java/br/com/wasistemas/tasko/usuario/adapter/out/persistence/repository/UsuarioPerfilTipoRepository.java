package br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPerfilTipoRepository extends JpaRepository<UsuarioPerfilTipoEntity, Long> {
    // Métodos customizados podem ser adicionados aqui
}

