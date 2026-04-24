package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface EmpresaLocalizacaoUseCases extends GenericUseCase<EmpresaLocalizacao, AdicionarEmpresaLocalizacao, AtualizarEmpresaLocalizacao> {
}
