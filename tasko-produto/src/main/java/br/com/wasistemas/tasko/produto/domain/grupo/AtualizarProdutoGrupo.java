package br.com.wasistemas.tasko.produto.domain.grupo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarProdutoGrupo {
    Long id;
    String descricaoGrupo;
}
