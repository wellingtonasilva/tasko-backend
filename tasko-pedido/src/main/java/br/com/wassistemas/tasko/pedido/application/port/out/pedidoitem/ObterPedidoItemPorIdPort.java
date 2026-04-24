package br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;

public interface ObterPedidoItemPorIdPort {
    PedidoItem obterPedidoItemPorId(Long id);
}
