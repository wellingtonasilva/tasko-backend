package br.com.wassistemas.tasko.common.domain.empresa;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class Empresa {

  Long id;
  String dominio;
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
