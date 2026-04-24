package br.com.wassistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import java.util.List;

public interface ListarLocalizacaoTipoPort {
    List<LocalizacaoTipo> listarLocalizacaoTipo(Paginacao paginacao);
}
