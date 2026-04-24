package br.com.wassistemas.tasko.empresa.adapter.in.web.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class EmpresaResponse {

  Long id;
  String nomeEmpresa;
  String numeroCnpj;
  String email;
  String logradouro;
  String numero;
  String nomeCidade;
  String nomeBairro;
  String uf;
  String numeroTelefone;
}
