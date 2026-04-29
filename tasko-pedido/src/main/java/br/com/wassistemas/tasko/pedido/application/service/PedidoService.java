package br.com.wassistemas.tasko.pedido.application.service;

import br.com.wassistemas.tasko.pedido.application.port.in.usecases.PedidoUseCases;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.AdicionarPedidoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.AtualizarPedidoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.ExcluirPedidoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.ListarPedidoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.ObterPedidoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PedidoService implements PedidoUseCases {

    private final AdicionarPedidoPort adicionarPedidoPort;
    private final AtualizarPedidoPort atualizarPedidoPort;
    private final ExcluirPedidoPorIdPort excluirPedidoPorIdPort;
    private final ListarPedidoPort listarPedidoPort;
    private final ObterPedidoPorIdPort obterPedidoPorIdPort;

    @Override
    public Pedido adicionar(Long empresaId, AdicionarPedido adicionar) {
        return adicionarPedidoPort.adicionarPedido(adicionar);
    }

    @Override
    public List<Pedido> listar(Long empresaId, Paginacao paginacao) {
        return listarPedidoPort.listarPedido(paginacao);
    }

    @Override
    public Pedido obterPorId(Long empresaId, Long id) {
        return obterPedidoPorIdPort.obterPedidoPorId(id);
    }

    @Override
    public Pedido atualizar(Long empresaId, Long id, AtualizarPedido atualizar) {
        return atualizarPedidoPort.atualizarPedido(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirPedidoPorIdPort.excluirPedidoPorId(id);
    }
}
