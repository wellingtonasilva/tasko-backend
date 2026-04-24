package br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo;

import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;

public interface AdicionarPedidoStatusTipoPort {
    PedidoStatusTipo adicionarPedidoStatusTipo(AdicionarPedidoStatusTipo adicionar);
}
