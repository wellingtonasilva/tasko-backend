package br.com.wasistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarEmpresaRequest;
import br.com.wasistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmpresaWebMapper {
    AdicionarEmpresa toDomain(AdicionarEmpresaRequest request);
}
