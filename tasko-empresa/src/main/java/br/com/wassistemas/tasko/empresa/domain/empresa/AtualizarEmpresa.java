package br.com.wassistemas.tasko.empresa.domain.empresa;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarEmpresa {

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
