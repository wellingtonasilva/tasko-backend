package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface EmpresaUseCases extends GenericUseCase<Empresa, AdicionarEmpresa, AtualizarEmpresa> {
}
