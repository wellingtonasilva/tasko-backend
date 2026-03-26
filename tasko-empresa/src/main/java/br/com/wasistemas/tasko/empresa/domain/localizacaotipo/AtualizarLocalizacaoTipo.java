package br.com.wasistemas.tasko.empresa.domain.localizacaotipo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarLocalizacaoTipo {
    Long id;
    String descricaoLocalizacaoTipo;
}
