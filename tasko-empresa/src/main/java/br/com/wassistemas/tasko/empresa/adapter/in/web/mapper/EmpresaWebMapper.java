package br.com.wassistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarEmpresaRequest;
import br.com.wassistemas.tasko.empresa.adapter.in.web.response.EmpresaResponse;
import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmpresaWebMapper {
    AdicionarEmpresa toDomain(AdicionarEmpresaRequest request);
    EmpresaResponse toResponse(Empresa domain);
    List<EmpresaResponse> toEmpresaResponse(List<Empresa> domain);
}
