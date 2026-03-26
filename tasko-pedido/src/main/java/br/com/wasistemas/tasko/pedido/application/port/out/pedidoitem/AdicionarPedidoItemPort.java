package br.com.wasistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;

public interface AdicionarPedidoItemPort {
    PedidoItem adicionarPedidoItem(AdicionarPedidoItem adicionar);
}
