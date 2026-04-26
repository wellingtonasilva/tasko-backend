package br.com.wassistemas.tasko.empresa.application.port.out.usuario;

import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.empresa.domain.empresa.CriarEmpresa;

public interface EmpresaUsuarioServicePort {
  void criarUsuarioParaEmpresa(Long empresaId, CriarEmpresa criarEmpresa) throws ResourceDuplicateException;
}
