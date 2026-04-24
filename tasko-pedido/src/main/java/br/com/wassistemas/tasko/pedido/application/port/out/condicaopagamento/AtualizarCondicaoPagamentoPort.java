package br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento;

import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;

public interface AtualizarCondicaoPagamentoPort {
    CondicaoPagamento atualizarCondicaoPagamento(Long id, AtualizarCondicaoPagamento atualizar);
}
