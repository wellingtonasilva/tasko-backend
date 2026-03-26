package br.com.wasistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarEntidadeTipoRequest;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EntidadeTipoWebMapper {
    AdicionarEntidadeTipo toDomain(AdicionarEntidadeTipoRequest request);
}
