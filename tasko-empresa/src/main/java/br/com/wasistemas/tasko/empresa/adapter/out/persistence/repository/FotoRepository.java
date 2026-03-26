package br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity.FotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository<FotoEntity, Long> {
}
