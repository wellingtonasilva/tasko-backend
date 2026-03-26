package br.com.wasistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;

public interface AdicionarLocalizacaoTipoPort {
    LocalizacaoTipo adicionarLocalizacaoTipo(AdicionarLocalizacaoTipo adicionar);
}
