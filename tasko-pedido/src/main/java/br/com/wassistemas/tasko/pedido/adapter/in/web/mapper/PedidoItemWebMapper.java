package br.com.wassistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoItemRequest;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AtualizarPedidoItemRequest;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoItemWebMapper {
    AdicionarPedidoItem toDomain(AdicionarPedidoItemRequest request);
    AtualizarPedidoItem toDomain(AtualizarPedidoItemRequest request);
}
