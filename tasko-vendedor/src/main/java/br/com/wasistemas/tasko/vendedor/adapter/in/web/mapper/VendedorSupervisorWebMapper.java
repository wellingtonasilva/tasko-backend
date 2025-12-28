package br.com.wasistemas.vendedor.adapter.in.web.mapper;

import br.com.wasistemas.vendedor.adapter.in.web.request.AdicionarVendedorSupervisorRequest;
import br.com.wasistemas.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorSupervisorWebMapper {
    AdicionarVendedorSupervisor toDomain(AdicionarVendedorSupervisorRequest request);
}
