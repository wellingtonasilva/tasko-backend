package br.com.wasistemas.tasko.pedido.domain.pedidostatustipo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarPedidoStatusTipo {
    Long id;
    String descricaoStatusTipo;
}
