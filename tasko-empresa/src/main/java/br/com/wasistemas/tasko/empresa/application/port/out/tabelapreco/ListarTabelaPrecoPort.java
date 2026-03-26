package br.com.wasistemas.tasko.empresa.application.port.out.tabelapreco;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import java.util.List;

public interface ListarTabelaPrecoPort {
    List<TabelaPreco> listarTabelaPreco(Paginacao paginacao);
}
