package br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import java.util.List;

public interface ListarCondicaoPagamentoPort {
    List<CondicaoPagamento> listarCondicaoPagamento(Paginacao paginacao);
}
