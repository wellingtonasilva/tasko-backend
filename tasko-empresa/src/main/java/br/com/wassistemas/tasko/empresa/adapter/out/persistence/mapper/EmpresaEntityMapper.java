package br.com.wassistemas.tasko.empresa.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity.EmpresaEntity;
import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmpresaEntityMapper {
    Empresa toDomain(EmpresaEntity entity);

    @Mapping(target = "id", ignore = true)
    EmpresaEntity toEntity(AdicionarEmpresa domain);

    EmpresaEntity toEntity(Long id, AtualizarEmpresa domain);
}
