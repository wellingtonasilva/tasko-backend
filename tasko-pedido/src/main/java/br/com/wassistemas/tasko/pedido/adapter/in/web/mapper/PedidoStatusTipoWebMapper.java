package br.com.wassistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarPedidoStatusTipoRequest;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoStatusTipoWebMapper {
    AdicionarPedidoStatusTipo toDomain(AdicionarPedidoStatusTipoRequest request);
}
