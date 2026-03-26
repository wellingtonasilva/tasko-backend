package br.com.wasistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;

public interface ObterPedidoItemPorIdPort {
    PedidoItem obterPedidoItemPorId(Long id);
}
