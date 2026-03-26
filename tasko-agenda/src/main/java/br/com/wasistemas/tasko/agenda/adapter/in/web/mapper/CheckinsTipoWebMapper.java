package br.com.wasistemas.tasko.agenda.adapter.in.web.mapper;

import br.com.wasistemas.tasko.agenda.adapter.in.web.request.AdicionarCheckinsTipoRequest;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CheckinsTipoWebMapper {
    AdicionarCheckinsTipo toDomain(AdicionarCheckinsTipoRequest request);
}
