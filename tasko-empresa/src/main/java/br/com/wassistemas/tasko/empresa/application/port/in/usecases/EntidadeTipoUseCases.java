package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface EntidadeTipoUseCases extends GenericUseCase<EntidadeTipo, AdicionarEntidadeTipo, AtualizarEntidadeTipo> {
}
