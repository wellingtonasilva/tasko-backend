package br.com.wassistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarEmpresaLocalizacaoRequest;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmpresaLocalizacaoWebMapper {
    AdicionarEmpresaLocalizacao toDomain(AdicionarEmpresaLocalizacaoRequest request);
}
