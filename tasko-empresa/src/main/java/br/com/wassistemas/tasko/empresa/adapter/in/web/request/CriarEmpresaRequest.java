package br.com.wassistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Criar Empresa")
public class CriarEmpresaRequest {

  @Schema(description = "Nome da Empresa", example = "Empresa Modelo")
  String nomeEmpresa;

  @Schema(description = "E-mail", example = "empresa@email.com")
  String email;

  @Schema(description = "Senha", example = "SuaSenhaSegura123")
  String senha;
}
