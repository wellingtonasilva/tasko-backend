package br.com.wasistemas.tasko.pedido.application.port.in.usecases;

import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface PedidoItemUseCases extends GenericUseCase<PedidoItem, AdicionarPedidoItem, AtualizarPedidoItem> {
}
