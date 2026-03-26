package br.com.wasistemas.tasko.pedido.application.port.in.usecases;

import br.com.wasistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wasistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wasistemas.tasko.pedido.domain.pedido.Pedido;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface PedidoUseCases extends GenericUseCase<Pedido, AdicionarPedido, AtualizarPedido> {
}
