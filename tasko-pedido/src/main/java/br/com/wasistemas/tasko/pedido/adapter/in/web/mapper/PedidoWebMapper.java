package br.com.wasistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wasistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoRequest;
import br.com.wasistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoWebMapper {
    AdicionarPedido toDomain(AdicionarPedidoRequest request);
}
