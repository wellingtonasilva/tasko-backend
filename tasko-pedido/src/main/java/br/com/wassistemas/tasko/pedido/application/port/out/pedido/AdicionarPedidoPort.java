package br.com.wassistemas.tasko.pedido.application.port.out.pedido;

import br.com.wassistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;

public interface AdicionarPedidoPort {
    Pedido adicionarPedido(AdicionarPedido adicionar);
}
