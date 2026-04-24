package br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;

public interface ObterLocalizacaoTipoPorIdPort {
    LocalizacaoTipo obterLocalizacaoTipoPorId(Long id);
}
