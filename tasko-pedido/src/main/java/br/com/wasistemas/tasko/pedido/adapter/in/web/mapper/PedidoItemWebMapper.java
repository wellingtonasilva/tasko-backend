package br.com.wasistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wasistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoItemRequest;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoItemWebMapper {
    AdicionarPedidoItem toDomain(AdicionarPedidoItemRequest request);
}
