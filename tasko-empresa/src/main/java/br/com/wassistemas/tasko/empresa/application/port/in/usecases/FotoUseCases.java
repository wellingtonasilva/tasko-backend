package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.foto.AdicionarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.Foto;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface FotoUseCases extends GenericUseCase<Foto, AdicionarFoto, AtualizarFoto> {
}
