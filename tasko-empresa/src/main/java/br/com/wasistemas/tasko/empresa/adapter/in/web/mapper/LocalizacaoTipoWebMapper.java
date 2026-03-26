package br.com.wasistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wasistemas.tasko.empresa.adapter.in.web.request.AdicionarLocalizacaoTipoRequest;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocalizacaoTipoWebMapper {
    AdicionarLocalizacaoTipo toDomain(AdicionarLocalizacaoTipoRequest request);
}
