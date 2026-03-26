package br.com.wasistemas.tasko.empresa.domain.tabelaprecotipo;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TabelaPrecoTipo {
    private Long id;
    private String descricaoTabelaPrecoTipo;
    private Auditoria auditoria;
}
