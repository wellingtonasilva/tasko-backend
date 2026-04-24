package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorTerritorioCidadeRequest;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorTerritorioCidadeWebMapper {
    AdicionarVendedorTerritorioCidade toDomain(AdicionarVendedorTerritorioCidadeRequest request);
}
