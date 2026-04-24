package br.com.wassistemas.tasko.empresa.domain.empresa;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class AdicionarEmpresa {

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
