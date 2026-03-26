package br.com.wasistemas.tasko.empresa.domain.tabelapreco;

import lombok.Value;
import java.time.LocalDate;

@Value
public class AdicionarTabelaPreco {
    Long tabelaPrecoTipoId;
    String nomeTabelaPreco;
    String descricaoTabelaPreco;
    LocalDate dataInicio;
    LocalDate dataFim;
}
