package br.com.wassistemas.tasko.cliente.adapter.in.web.mapper;

import br.com.wassistemas.tasko.cliente.adapter.in.web.request.AdicionarClienteRequest;
import br.com.wassistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClienteWebMapper {
    AdicionarCliente toDomain(Long empresaId, AdicionarClienteRequest request);
}

