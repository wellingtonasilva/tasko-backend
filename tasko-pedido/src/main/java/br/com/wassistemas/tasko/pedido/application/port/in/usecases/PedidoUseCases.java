package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface PedidoUseCases extends GenericUseCase<Pedido, AdicionarPedido, AtualizarPedido> {
}
