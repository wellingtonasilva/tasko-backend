package br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaVisitaRepository extends JpaRepository<AgendaVisitaEntity, Long> {
}
