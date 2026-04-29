package br.com.wassistemas.tasko.empresa.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;

public interface LocalizacaoTipoUseCases extends
    BaseUseCase<LocalizacaoTipo, AdicionarLocalizacaoTipo, AtualizarLocalizacaoTipo> {
}
