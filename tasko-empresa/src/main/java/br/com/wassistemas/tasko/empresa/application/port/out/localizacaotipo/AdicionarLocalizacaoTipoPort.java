package br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;

public interface AdicionarLocalizacaoTipoPort {
    LocalizacaoTipo adicionarLocalizacaoTipo(AdicionarLocalizacaoTipo adicionar);
}
