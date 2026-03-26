package br.com.wasistemas.tasko.empresa.domain.entidadetipo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarEntidadeTipo {
    Long id;
    String descricaoEntidadeTipo;
}
