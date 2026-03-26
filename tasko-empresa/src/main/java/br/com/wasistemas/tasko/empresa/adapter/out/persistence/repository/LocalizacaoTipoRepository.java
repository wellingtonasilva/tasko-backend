package br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity.LocalizacaoTipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoTipoRepository extends JpaRepository<LocalizacaoTipoEntity, Long> {
}
