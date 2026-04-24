package br.com.wassistemas.tasko.vendedor.adapter.in.web.mapper;

import br.com.wassistemas.tasko.vendedor.adapter.in.web.request.AdicionarVendedorMetaRequest;
import br.com.wassistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorMetaWebMapper {
    AdicionarVendedorMeta toDomain(AdicionarVendedorMetaRequest request);
    AtualizarVendedorMeta toDomain(AtualizarVendedorMeta request);
}
