package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorSupervisorRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AtualizarVendedorRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AtualizarVendedorSupervisorRequest;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorSupervisorWebMapper {
    AdicionarVendedorSupervisor toDomain(Long empresaId, AdicionarVendedorSupervisorRequest request);
    AtualizarVendedorSupervisor toDomain(AtualizarVendedorSupervisorRequest request);
}
