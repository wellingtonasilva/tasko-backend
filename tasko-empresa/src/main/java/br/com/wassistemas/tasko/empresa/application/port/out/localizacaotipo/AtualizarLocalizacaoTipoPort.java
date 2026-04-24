package br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;

public interface AtualizarLocalizacaoTipoPort {
    LocalizacaoTipo atualizarLocalizacaoTipo(Long id, AtualizarLocalizacaoTipo atualizar);
}
