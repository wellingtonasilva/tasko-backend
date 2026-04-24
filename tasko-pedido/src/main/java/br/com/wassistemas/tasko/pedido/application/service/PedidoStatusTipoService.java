package br.com.wassistemas.tasko.pedido.application.service;

import br.com.wassistemas.tasko.pedido.application.port.in.usecases.PedidoStatusTipoUseCases;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo.AdicionarPedidoStatusTipoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo.AtualizarPedidoStatusTipoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo.ExcluirPedidoStatusTipoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo.ListarPedidoStatusTipoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidostatustipo.ObterPedidoStatusTipoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wassistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PedidoStatusTipoService implements PedidoStatusTipoUseCases {

    private final AdicionarPedidoStatusTipoPort adicionarPedidoStatusTipoPort;
    private final AtualizarPedidoStatusTipoPort atualizarPedidoStatusTipoPort;
    private final ExcluirPedidoStatusTipoPorIdPort excluirPedidoStatusTipoPorIdPort;
    private final ListarPedidoStatusTipoPort listarPedidoStatusTipoPort;
    private final ObterPedidoStatusTipoPorIdPort obterPedidoStatusTipoPorIdPort;

    @Override
    public PedidoStatusTipo adicionar(AdicionarPedidoStatusTipo adicionar) {
        return adicionarPedidoStatusTipoPort.adicionarPedidoStatusTipo(adicionar);
    }

    @Override
    public List<PedidoStatusTipo> listar(Paginacao paginacao) {
        return listarPedidoStatusTipoPort.listarPedidoStatusTipo(paginacao);
    }

    @Override
    public PedidoStatusTipo obterPorId(Long id) {
        return obterPedidoStatusTipoPorIdPort.obterPedidoStatusTipoPorId(id);
    }

    @Override
    public PedidoStatusTipo atualizar(Long id, AtualizarPedidoStatusTipo atualizar) {
        return atualizarPedidoStatusTipoPort.atualizarPedidoStatusTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirPedidoStatusTipoPorIdPort.excluirPedidoStatusTipoPorId(id);
    }
}
