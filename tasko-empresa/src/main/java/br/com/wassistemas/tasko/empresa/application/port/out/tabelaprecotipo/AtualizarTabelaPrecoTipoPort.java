package br.com.wassistemas.tasko.empresa.application.port.out.tabelaprecotipo;

import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.AtualizarTabelaPrecoTipo;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.TabelaPrecoTipo;

public interface AtualizarTabelaPrecoTipoPort {
    TabelaPrecoTipo atualizarTabelaPrecoTipo(Long id, AtualizarTabelaPrecoTipo atualizar);
}
