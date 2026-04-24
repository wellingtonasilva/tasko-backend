package br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;
import java.util.List;

public interface ListarTabelaPrecoTipoPort {
    List<TabelaPrecoTipo> listarTabelaPrecoTipo(Paginacao paginacao);
}
