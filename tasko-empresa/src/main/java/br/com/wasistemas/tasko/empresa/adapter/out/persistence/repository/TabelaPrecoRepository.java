package br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity.TabelaPrecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabelaPrecoRepository extends JpaRepository<TabelaPrecoEntity, Long> {
}
