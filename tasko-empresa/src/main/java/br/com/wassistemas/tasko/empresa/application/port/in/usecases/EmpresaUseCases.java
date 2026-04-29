package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.empresa.domain.empresa.CriarEmpresa;

public interface EmpresaUseCases extends
    BaseUseCase<Empresa, AdicionarEmpresa, AtualizarEmpresa> {
  Empresa criarEmpresa(CriarEmpresa criarEmpresa) throws ResourceDuplicateException;
}
