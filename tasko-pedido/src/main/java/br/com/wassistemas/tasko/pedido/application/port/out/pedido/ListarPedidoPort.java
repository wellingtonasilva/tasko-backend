package br.com.wassistemas.tasko.pedido.application.port.out.pedido;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;
import java.util.List;

public interface ListarPedidoPort {
    List<Pedido> listarPedido(Long empresaId, Paginacao paginacao);
}
