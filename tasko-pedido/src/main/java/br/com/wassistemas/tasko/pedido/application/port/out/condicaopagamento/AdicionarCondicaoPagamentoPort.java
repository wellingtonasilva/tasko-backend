package br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento;

import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;

public interface AdicionarCondicaoPagamentoPort {
    CondicaoPagamento adicionarCondicaoPagamento(AdicionarCondicaoPagamento adicionar);
}
