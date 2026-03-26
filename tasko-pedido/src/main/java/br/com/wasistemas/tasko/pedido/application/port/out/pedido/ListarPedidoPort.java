package br.com.wasistemas.tasko.pedido.application.port.out.pedido;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.pedido.domain.pedido.Pedido;
import java.util.List;

public interface ListarPedidoPort {
    List<Pedido> listarPedido(Paginacao paginacao);
}
