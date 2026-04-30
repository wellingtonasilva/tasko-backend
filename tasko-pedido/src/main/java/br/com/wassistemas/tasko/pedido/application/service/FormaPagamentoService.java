package br.com.wassistemas.tasko.pedido.application.service;

import br.com.wassistemas.tasko.pedido.application.port.in.usecases.FormaPagamentoUseCases;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.AdicionarFormaPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.AtualizarFormaPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.ExcluirFormaPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.ListarFormaPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.ObterFormaPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
    public FormaPagamento adicionar(Long empresaId, AdicionarFormaPagamento adicionar) {
        return adicionarFormaPagamentoPort.adicionarFormaPagamento(adicionar);
    }

    @Override
    public List<FormaPagamento> listar(Long empresaId, Paginacao paginacao) {
        return listarFormaPagamentoPort.listarFormaPagamento(empresaId, paginacao);
    }

    @Override
    public FormaPagamento obterPorId(Long empresaId, Long id) {
        return obterFormaPagamentoPorIdPort.obterFormaPagamentoPorId(id);
    }

    @Override
    public FormaPagamento atualizar(Long empresaId, Long id, AtualizarFormaPagamento atualizar) {
        return atualizarFormaPagamentoPort.atualizarFormaPagamento(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirFormaPagamentoPorIdPort.excluirFormaPagamentoPorId(id);
    }
}
