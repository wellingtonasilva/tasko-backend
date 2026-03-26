package br.com.wasistemas.tasko.pedido.application.service;

import br.com.wasistemas.tasko.pedido.application.port.in.usecases.PedidoUseCases;
import br.com.wasistemas.tasko.pedido.application.port.out.pedido.*;
import br.com.wasistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wasistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wasistemas.tasko.pedido.domain.pedido.Pedido;
import br.com.wasistemas.tasko.common.domain.Paginacao;
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
    public Pedido adicionar(AdicionarPedido adicionar) {
        return adicionarPedidoPort.adicionarPedido(adicionar);
    }

    @Override
    public List<Pedido> listar(Paginacao paginacao) {
        return listarPedidoPort.listarPedido(paginacao);
    }

    @Override
    public Pedido obterPorId(Long id) {
        return obterPedidoPorIdPort.obterPedidoPorId(id);
    }

    @Override
    public Pedido atualizar(Long id, AtualizarPedido atualizar) {
        return atualizarPedidoPort.atualizarPedido(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirPedidoPorIdPort.excluirPedidoPorId(id);
    }
}
