package br.com.wassistemas.tasko.pedido.application.service;

import br.com.wassistemas.tasko.pedido.application.port.in.usecases.CondicaoPagamentoUseCases;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.AdicionarCondicaoPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.AtualizarCondicaoPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.ExcluirCondicaoPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.ListarCondicaoPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.ObterCondicaoPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
    public CondicaoPagamento adicionar(Long empresaId, AdicionarCondicaoPagamento adicionar) {
        return adicionarCondicaoPagamentoPort.adicionarCondicaoPagamento(adicionar);
    }

    @Override
    public List<CondicaoPagamento> listar(Long empresaId, Paginacao paginacao) {
        return listarCondicaoPagamentoPort.listarCondicaoPagamento(paginacao);
    }

    @Override
    public CondicaoPagamento obterPorId(Long empresaId, Long id) {
        return obterCondicaoPagamentoPorIdPort.obterCondicaoPagamentoPorId(id);
    }

    @Override
    public CondicaoPagamento atualizar(Long empresaId, Long id, AtualizarCondicaoPagamento atualizar) {
        return atualizarCondicaoPagamentoPort.atualizarCondicaoPagamento(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirCondicaoPagamentoPorIdPort.excluirCondicaoPagamentoPorId(id);
    }
}
