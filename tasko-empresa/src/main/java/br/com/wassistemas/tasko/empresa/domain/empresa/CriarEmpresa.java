package br.com.wassistemas.tasko.empresa.domain.empresa;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CriarEmpresa {

  String nomeEmpresa;
  String email;
  String senha;
}
