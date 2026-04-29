package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;

public interface EmpresaLocalizacaoUseCases extends
    BaseUseCase<EmpresaLocalizacao, AdicionarEmpresaLocalizacao, AtualizarEmpresaLocalizacao> {
}
