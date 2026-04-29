package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;

public interface EntidadeTipoUseCases extends
    BaseUseCase<EntidadeTipo, AdicionarEntidadeTipo, AtualizarEntidadeTipo> {
}
