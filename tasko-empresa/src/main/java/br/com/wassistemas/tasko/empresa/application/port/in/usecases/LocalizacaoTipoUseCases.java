package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface LocalizacaoTipoUseCases extends GenericUseCase<LocalizacaoTipo, AdicionarLocalizacaoTipo, AtualizarLocalizacaoTipo> {
}
