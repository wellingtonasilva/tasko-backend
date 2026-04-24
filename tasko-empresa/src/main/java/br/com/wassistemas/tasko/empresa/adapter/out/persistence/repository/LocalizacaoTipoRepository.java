package br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.LocalizacaoTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoTipoRepository extends JpaRepository<LocalizacaoTipoEntity, Long> {
}
