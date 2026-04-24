package br.com.wasistemas.tasko.empresa.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar Empresa")
public class AdicionarEmpresaRequest {

  @Schema(description = "Nome da Empresa", example = "Empresa Modelo")
  String nomeEmpresa;

  @Schema(description = "Número do CNPJ", example = "99.999.999-99")
  String numeroCnpj;

  @Schema(description = "E-mail", example = "empresa@email.com")
  String email;

  @Schema(description = "Av, Rua etc", example = "Rua A")
  String logradouro;

  @Schema(description = "Número do Imóvel", example = "Al. 1")
  String numero;

  @Schema(description = "Nome da Cidade", example = "Cidade A")
  String nomeCidade;

  @Schema(description = "Nome do Bairro", example = "Bairro A")
  String nomeBairro;

  @Schema(description = "UF", example = "DF")
  String uf;

  @Schema(description = "Número do Telefone", example = "(99) 99999-9999")
  String numeroTelefone;
}
