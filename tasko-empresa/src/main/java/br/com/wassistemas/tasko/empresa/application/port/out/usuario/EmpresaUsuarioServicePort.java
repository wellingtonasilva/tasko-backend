package br.com.wassistemas.tasko.empresa.application.port.out.usuario;

import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;

public interface EmpresaUsuarioServicePort {
  void criarUsuarioParaEmpresa(Empresa empresa) throws ResourceDuplicateException;
}
