package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;

public interface PedidoStatusTipoUseCases extends
    BaseUseCase<PedidoStatusTipo, AdicionarPedidoStatusTipo, AtualizarPedidoStatusTipo> {
}
