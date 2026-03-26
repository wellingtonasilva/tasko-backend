package br.com.wasistemas.tasko.agenda.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaVisitaStatusRepository extends JpaRepository<AgendaVisitaStatusEntity, Long> {
}
