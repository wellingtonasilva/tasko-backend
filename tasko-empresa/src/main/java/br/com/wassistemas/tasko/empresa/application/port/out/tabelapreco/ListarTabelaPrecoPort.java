package br.com.wassistemas.tasko.empresa.application.port.out.tabelapreco;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.TabelaPreco;
import java.util.List;

public interface ListarTabelaPrecoPort {
    List<TabelaPreco> listarTabelaPreco(Paginacao paginacao);
}
