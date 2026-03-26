package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface EntidadeTipoUseCases extends GenericUseCase<EntidadeTipo, AdicionarEntidadeTipo, AtualizarEntidadeTipo> {
}
