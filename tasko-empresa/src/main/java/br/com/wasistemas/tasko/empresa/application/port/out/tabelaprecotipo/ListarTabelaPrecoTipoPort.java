package br.com.wasistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import java.util.List;

public interface ListarTabelaPrecoTipoPort {
    List<TabelaPrecoTipo> listarTabelaPrecoTipo(Paginacao paginacao);
}
