package br.com.wasistemas.tasko.pedido.application.service;

import br.com.wasistemas.tasko.pedido.application.port.in.usecases.PedidoItemUseCases;
import br.com.wasistemas.tasko.pedido.application.port.out.pedidoitem.*;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wasistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PedidoItemService implements PedidoItemUseCases {

    private final AdicionarPedidoItemPort adicionarPedidoItemPort;
    private final AtualizarPedidoItemPort atualizarPedidoItemPort;
    private final ExcluirPedidoItemPorIdPort excluirPedidoItemPorIdPort;
    private final ListarPedidoItemPort listarPedidoItemPort;
    private final ObterPedidoItemPorIdPort obterPedidoItemPorIdPort;

    @Override
    public PedidoItem adicionar(AdicionarPedidoItem adicionar) {
        return adicionarPedidoItemPort.adicionarPedidoItem(adicionar);
    }

    @Override
    public List<PedidoItem> listar(Paginacao paginacao) {
        return listarPedidoItemPort.listarPedidoItem(paginacao);
    }

    @Override
    public PedidoItem obterPorId(Long id) {
        return obterPedidoItemPorIdPort.obterPedidoItemPorId(id);
    }

    @Override
    public PedidoItem atualizar(Long id, AtualizarPedidoItem atualizar) {
        return atualizarPedidoItemPort.atualizarPedidoItem(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirPedidoItemPorIdPort.excluirPedidoItemPorId(id);
    }
}
