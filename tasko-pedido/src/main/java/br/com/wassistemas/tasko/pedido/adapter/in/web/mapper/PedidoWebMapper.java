package br.com.wassistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoRequest;
import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AtualizarPedidoRequest;
import br.com.wassistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoWebMapper {
    AdicionarPedido toDomain(Long empresaId, AdicionarPedidoRequest request);
    AtualizarPedido toDomain(Long empresaId, AtualizarPedidoRequest request);
}
