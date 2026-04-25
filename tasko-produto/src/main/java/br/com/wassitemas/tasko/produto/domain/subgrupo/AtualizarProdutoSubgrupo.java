package br.com.wassitemas.tasko.produto.domain.subgrupo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarProdutoSubgrupo {
    Long id;
    Long empresaId;
    String descricaoSubgrupo;
}
