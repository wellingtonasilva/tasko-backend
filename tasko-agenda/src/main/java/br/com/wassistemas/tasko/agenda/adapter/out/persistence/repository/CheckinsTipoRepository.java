package br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.CheckinsTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckinsTipoRepository extends JpaRepository<CheckinsTipoEntity, Long> {
}
