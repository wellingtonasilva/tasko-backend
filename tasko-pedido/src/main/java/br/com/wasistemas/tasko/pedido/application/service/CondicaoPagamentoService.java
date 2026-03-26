package br.com.wasistemas.tasko.pedido.application.service;

import br.com.wasistemas.tasko.pedido.application.port.in.usecases.CondicaoPagamentoUseCases;
import br.com.wasistemas.tasko.pedido.application.port.out.condicaopagamento.*;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CondicaoPagamentoService implements CondicaoPagamentoUseCases {

    private final AdicionarCondicaoPagamentoPort adicionarCondicaoPagamentoPort;
    private final AtualizarCondicaoPagamentoPort atualizarCondicaoPagamentoPort;
    private final ExcluirCondicaoPagamentoPorIdPort excluirCondicaoPagamentoPorIdPort;
    private final ListarCondicaoPagamentoPort listarCondicaoPagamentoPort;
    private final ObterCondicaoPagamentoPorIdPort obterCondicaoPagamentoPorIdPort;

    @Override
    public CondicaoPagamento adicionar(AdicionarCondicaoPagamento adicionar) {
        return adicionarCondicaoPagamentoPort.adicionarCondicaoPagamento(adicionar);
    }

    @Override
    public List<CondicaoPagamento> listar(Paginacao paginacao) {
        return listarCondicaoPagamentoPort.listarCondicaoPagamento(paginacao);
    }

    @Override
    public CondicaoPagamento obterPorId(Long id) {
        return obterCondicaoPagamentoPorIdPort.obterCondicaoPagamentoPorId(id);
    }

    @Override
    public CondicaoPagamento atualizar(Long id, AtualizarCondicaoPagamento atualizar) {
        return atualizarCondicaoPagamentoPort.atualizarCondicaoPagamento(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirCondicaoPagamentoPorIdPort.excluirCondicaoPagamentoPorId(id);
    }
}
