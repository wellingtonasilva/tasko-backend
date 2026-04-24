package br.com.wassistemas.tasko.pedido.application.port.out.pedido;

import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;

public interface ObterPedidoPorIdPort {
    Pedido obterPedidoPorId(Long id);
}
