package br.com.wassistemas.tasko.pedido.domain.formapagamento;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarFormaPagamento {
    Long id;
    Long empresaId;
    String descricaoFormaPagamento;
}
