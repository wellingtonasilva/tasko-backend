package br.com.wassistemas.tasko.pedido.application.port.out.pedido;

import br.com.wassistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;

public interface AtualizarPedidoPort {
    Pedido atualizarPedido(Long id, AtualizarPedido atualizar);
}
