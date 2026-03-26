package br.com.wasistemas.tasko.pedido.application.service;

import br.com.wasistemas.tasko.pedido.application.port.in.usecases.FormaPagamentoUseCases;
import br.com.wasistemas.tasko.pedido.application.port.out.formapagamento.*;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FormaPagamentoService implements FormaPagamentoUseCases {

    private final AdicionarFormaPagamentoPort adicionarFormaPagamentoPort;
    private final AtualizarFormaPagamentoPort atualizarFormaPagamentoPort;
    private final ExcluirFormaPagamentoPorIdPort excluirFormaPagamentoPorIdPort;
    private final ListarFormaPagamentoPort listarFormaPagamentoPort;
    private final ObterFormaPagamentoPorIdPort obterFormaPagamentoPorIdPort;

    @Override
    public FormaPagamento adicionar(AdicionarFormaPagamento adicionar) {
        return adicionarFormaPagamentoPort.adicionarFormaPagamento(adicionar);
    }

    @Override
    public List<FormaPagamento> listar(Paginacao paginacao) {
        return listarFormaPagamentoPort.listarFormaPagamento(paginacao);
    }

    @Override
    public FormaPagamento obterPorId(Long id) {
        return obterFormaPagamentoPorIdPort.obterFormaPagamentoPorId(id);
    }

    @Override
    public FormaPagamento atualizar(Long id, AtualizarFormaPagamento atualizar) {
        return atualizarFormaPagamentoPort.atualizarFormaPagamento(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirFormaPagamentoPorIdPort.excluirFormaPagamentoPorId(id);
    }
}
