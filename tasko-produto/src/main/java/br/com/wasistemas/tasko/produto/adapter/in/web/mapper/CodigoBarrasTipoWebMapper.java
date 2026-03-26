package br.com.wasistemas.tasko.produto.adapter.in.web.mapper;

import br.com.wasistemas.tasko.produto.adapter.in.web.request.AdicionarCodigoBarrasTipoRequest;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CodigoBarrasTipoWebMapper {
    AdicionarCodigoBarrasTipo toDomain(AdicionarCodigoBarrasTipoRequest request);
}
