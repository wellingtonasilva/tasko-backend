package br.com.wassistemas.tasko.pedido.domain.formapagamento;

import lombok.Value;


@Value
public class AdicionarFormaPagamento {
    Long empresaId;
    String descricaoFormaPagamento;
}
