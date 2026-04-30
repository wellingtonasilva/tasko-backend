package br.com.wassistemas.tasko.produto.domain.codigobarrastipo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarCodigoBarrasTipo {
    Long id;
    String nomeTipo;
}
