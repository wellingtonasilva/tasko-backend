package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface EmpresaUseCases extends GenericUseCase<Empresa, AdicionarEmpresa, AtualizarEmpresa> {
}
