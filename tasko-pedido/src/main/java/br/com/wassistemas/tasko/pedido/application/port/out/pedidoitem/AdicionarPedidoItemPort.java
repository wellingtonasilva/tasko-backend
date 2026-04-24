package br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;

public interface AdicionarPedidoItemPort {
    PedidoItem adicionarPedidoItem(AdicionarPedidoItem adicionar);
}
