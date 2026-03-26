package br.com.wasistemas.tasko.empresa.application.port.in.usecases;

import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface LocalizacaoTipoUseCases extends GenericUseCase<LocalizacaoTipo, AdicionarLocalizacaoTipo, AtualizarLocalizacaoTipo> {
}
