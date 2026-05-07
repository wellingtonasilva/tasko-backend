package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AtualizarVendedorRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.response.VendedorResponse;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorWebMapper {
    AdicionarVendedor toDomain(Long empresaId, AdicionarVendedorRequest request);
    AtualizarVendedor toDomain(AtualizarVendedorRequest request);

    VendedorResponse toResponse(Vendedor vendedor);
}
