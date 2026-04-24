package br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import java.util.List;

public interface ListarPedidoStatusTipoPort {
    List<PedidoStatusTipo> listarPedidoStatusTipo(Paginacao paginacao);
}
