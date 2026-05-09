package br.com.wassistemas.tasko.pedido.application.port.out.formapagamento;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import java.util.List;

public interface ListarFormaPagamentoPort {
    List<FormaPagamento> listarFormaPagamento(Paginacao paginacao);
}
