package br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.FotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository<FotoEntity, Long> {
}
