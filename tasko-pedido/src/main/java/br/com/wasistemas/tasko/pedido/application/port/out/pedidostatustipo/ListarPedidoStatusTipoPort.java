package br.com.wasistemas.tasko.pedido.application.port.out.pedidostatustipo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import java.util.List;

public interface ListarPedidoStatusTipoPort {
    List<PedidoStatusTipo> listarPedidoStatusTipo(Paginacao paginacao);
}
