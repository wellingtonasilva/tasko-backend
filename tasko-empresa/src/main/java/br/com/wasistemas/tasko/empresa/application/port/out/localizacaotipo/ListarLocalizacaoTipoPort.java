package br.com.wasistemas.tasko.empresa.application.port.out.localizacaotipo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import java.util.List;

public interface ListarLocalizacaoTipoPort {
    List<LocalizacaoTipo> listarLocalizacaoTipo(Paginacao paginacao);
}
