package br.com.wasistemas.tasko.pedido.application.port.in.usecases;

import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface PedidoStatusTipoUseCases extends GenericUseCase<PedidoStatusTipo, AdicionarPedidoStatusTipo, AtualizarPedidoStatusTipo> {
}
