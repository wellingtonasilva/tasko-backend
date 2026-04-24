package br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.EmpresaLocalizacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaLocalizacaoRepository extends JpaRepository<EmpresaLocalizacaoEntity, Long> {
}
