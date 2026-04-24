package br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import java.util.List;

public interface ListarPedidoItemPort {
    List<PedidoItem> listarPedidoItem(Paginacao paginacao);
}
