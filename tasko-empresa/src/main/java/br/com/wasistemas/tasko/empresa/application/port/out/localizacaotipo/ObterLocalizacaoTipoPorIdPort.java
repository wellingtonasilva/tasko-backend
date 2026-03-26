package br.com.wasistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;

public interface ObterLocalizacaoTipoPorIdPort {
    LocalizacaoTipo obterLocalizacaoTipoPorId(Long id);
}
