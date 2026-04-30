package br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaVisitaRepository extends JpaRepository<AgendaVisitaEntity, Long> {
  Page<AgendaVisitaEntity> findByEmpresaId(Long empresaId, Pageable pageable);
}
