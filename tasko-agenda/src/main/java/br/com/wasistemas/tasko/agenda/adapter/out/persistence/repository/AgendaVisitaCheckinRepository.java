package br.com.wasistemas.tasko.agenda.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaCheckinEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaVisitaCheckinRepository extends JpaRepository<AgendaVisitaCheckinEntity, Long> {
}
