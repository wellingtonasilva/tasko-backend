package br.com.wassistemas.tasko.pedido.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;

public interface PedidoItemUseCases extends
    BaseUseCase<PedidoItem, AdicionarPedidoItem, AtualizarPedidoItem> {
}
