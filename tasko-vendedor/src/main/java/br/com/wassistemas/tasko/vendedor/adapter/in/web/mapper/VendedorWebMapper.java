package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorRequest;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorWebMapper {
    AdicionarVendedor toDomain(AdicionarVendedorRequest request);
}
