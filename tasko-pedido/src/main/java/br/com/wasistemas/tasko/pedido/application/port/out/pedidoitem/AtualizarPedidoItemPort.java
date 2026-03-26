package br.com.wasistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;

public interface AtualizarPedidoItemPort {
    PedidoItem atualizarPedidoItem(Long id, AtualizarPedidoItem atualizar);
}
