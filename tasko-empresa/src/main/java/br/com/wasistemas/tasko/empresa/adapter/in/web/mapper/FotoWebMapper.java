package br.com.wasistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarFotoRequest;
import br.com.wasistemas.tasko.empresa.domain.foto.AdicionarFoto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FotoWebMapper {
    AdicionarFoto toDomain(AdicionarFotoRequest request);
}
