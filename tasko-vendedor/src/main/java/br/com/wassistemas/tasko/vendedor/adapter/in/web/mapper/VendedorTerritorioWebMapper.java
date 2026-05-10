package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorTerritorioRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AtualizarVendedorTerritorioRequest;
import br.com.wassistemas.tasko.vendedor.adapter.in.web.response.VendedorTerritorioResponse;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorTerritorioWebMapper {

  AdicionarVendedorTerritorio toDomain(Long empresaId, AdicionarVendedorTerritorioRequest request);

  AtualizarVendedorTerritorio toDomain(AtualizarVendedorTerritorioRequest request);

  VendedorTerritorioResponse toResponse(VendedorTerritorio domain);

  List<VendedorTerritorioResponse> toList(List<VendedorTerritorio> domain);
}
