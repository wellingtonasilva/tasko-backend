package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface PedidoItemUseCases extends GenericUseCase<PedidoItem, AdicionarPedidoItem, AtualizarPedidoItem> {
}
