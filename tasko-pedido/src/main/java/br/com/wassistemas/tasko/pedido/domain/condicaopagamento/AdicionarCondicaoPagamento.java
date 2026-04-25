package br.com.wassistemas.tasko.pedido.domain.condicaopagamento;

import lombok.Value;


@Value
public class AdicionarCondicaoPagamento {
    Long empresaId;
    String descricaoCondicaoPagamento;
    String condicaoPagamento;
}
