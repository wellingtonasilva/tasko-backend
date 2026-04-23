package br.com.wasistemas.tasko.usuario.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioEmpresaRepository extends JpaRepository<UsuarioEmpresaEntity, Long> {
    // Métodos customizados podem ser adicionados aqui
}

