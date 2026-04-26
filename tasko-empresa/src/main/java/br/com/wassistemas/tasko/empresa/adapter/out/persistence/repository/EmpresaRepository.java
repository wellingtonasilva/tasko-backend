package br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

  Long countByDominio(String dominio);

  Long countByEmail(String email);
}
