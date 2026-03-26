package br.com.wasistemas.tasko.pedido.application.port.out.pedidostatustipo;

import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;

public interface AdicionarPedidoStatusTipoPort {
    PedidoStatusTipo adicionarPedidoStatusTipo(AdicionarPedidoStatusTipo adicionar);
}
