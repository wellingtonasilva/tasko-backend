package br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarTabelaPrecoTipo {
    Long id;
    String descricaoTabelaPrecoTipo;
}
