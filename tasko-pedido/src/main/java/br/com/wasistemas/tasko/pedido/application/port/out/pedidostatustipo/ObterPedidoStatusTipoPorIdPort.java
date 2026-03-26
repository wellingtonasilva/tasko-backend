package br.com.wasistemas.tasko.pedido.application.port.out.pedidostatustipo;

import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;

public interface ObterPedidoStatusTipoPorIdPort {
    PedidoStatusTipo obterPedidoStatusTipoPorId(Long id);
}
