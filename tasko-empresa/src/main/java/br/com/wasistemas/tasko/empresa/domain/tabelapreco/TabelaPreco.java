package br.com.wasistemas.tasko.empresa.domain.tabelapreco;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder
public class TabelaPreco {
    private Long id;
    private Long tabelaPrecoTipoId;
    private String nomeTabelaPreco;
    private String descricaoTabelaPreco;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Auditoria auditoria;
}
