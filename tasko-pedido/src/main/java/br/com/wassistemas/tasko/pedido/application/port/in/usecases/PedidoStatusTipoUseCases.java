package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface PedidoStatusTipoUseCases extends GenericUseCase<PedidoStatusTipo, AdicionarPedidoStatusTipo, AtualizarPedidoStatusTipo> {
}
