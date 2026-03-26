package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.foto.AdicionarFoto;
import br.com.wasistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wasistemas.tasko.empresa.domain.foto.Foto;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface FotoUseCases extends GenericUseCase<Foto, AdicionarFoto, AtualizarFoto> {
}
