package br.com.wasistemas.tasko.pedido.application.port.out.pedidoitem;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import java.util.List;

public interface ListarPedidoItemPort {
    List<PedidoItem> listarPedidoItem(Paginacao paginacao);
}
