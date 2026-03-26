package br.com.wasistemas.tasko.pedido.application.port.out.pedidostatustipo;

import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;

public interface AtualizarPedidoStatusTipoPort {
    PedidoStatusTipo atualizarPedidoStatusTipo(Long id, AtualizarPedidoStatusTipo atualizar);
}
