package br.com.wassistemas.tasko.produto.domain.grupo;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarProdutoGrupo {
    Long id;
    Long empresaId;
    String descricaoGrupo;
}
