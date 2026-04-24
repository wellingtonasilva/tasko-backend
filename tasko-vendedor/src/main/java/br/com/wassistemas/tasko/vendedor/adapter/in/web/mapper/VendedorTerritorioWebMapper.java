package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorTerritorioRequest;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorTerritorioWebMapper {
    AdicionarVendedorTerritorio toDomain(AdicionarVendedorTerritorioRequest request);
}
