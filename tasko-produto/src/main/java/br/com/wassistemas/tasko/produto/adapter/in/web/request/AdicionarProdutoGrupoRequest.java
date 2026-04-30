package br.com.wassistemas.tasko.produto.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Grupo")
public class AdicionarProdutoGrupoRequest {
    @Schema(description = "Descrição do Grupo")
    String descricaoGrupo;
}
