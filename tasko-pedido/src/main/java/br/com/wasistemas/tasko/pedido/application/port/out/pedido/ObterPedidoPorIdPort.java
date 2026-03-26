package br.com.wasistemas.tasko.pedido.application.port.out.pedido;

import br.com.wasistemas.tasko.pedido.domain.pedido.Pedido;

public interface ObterPedidoPorIdPort {
    Pedido obterPedidoPorId(Long id);
}
