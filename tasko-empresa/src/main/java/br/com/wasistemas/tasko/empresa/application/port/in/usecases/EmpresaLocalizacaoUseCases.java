package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface EmpresaLocalizacaoUseCases extends GenericUseCase<EmpresaLocalizacao, AdicionarEmpresaLocalizacao, AtualizarEmpresaLocalizacao> {
}
