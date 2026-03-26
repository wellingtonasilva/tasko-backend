package br.com.wasistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import java.util.List;

public interface ListarFormaPagamentoPort {
    List<FormaPagamento> listarFormaPagamento(Paginacao paginacao);
}
