package br.com.wasistemas.vendedor.adapter.in.web.mapper;

import br.com.wasistemas.vendedor.adapter.in.web.request.AdicionarVendedorRequest;
import br.com.wasistemas.vendedor.domain.vendedor.AdicionarVendedor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorWebMapper {
    AdicionarVendedor toDomain(AdicionarVendedorRequest request);
}
