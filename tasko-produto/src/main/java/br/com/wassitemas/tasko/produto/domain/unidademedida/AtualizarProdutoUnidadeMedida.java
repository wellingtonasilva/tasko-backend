package br.com.wassitemas.tasko.produto.domain.unidademedida;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarProdutoUnidadeMedida {
    Long id;
    String descricaoUnidadeMedida;
}
