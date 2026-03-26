package br.com.wasistemas.tasko.pedido.application.port.out.condicaopagamento;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import java.util.List;

public interface ListarCondicaoPagamentoPort {
    List<CondicaoPagamento> listarCondicaoPagamento(Paginacao paginacao);
}
