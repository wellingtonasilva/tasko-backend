package br.com.wassistemas.tasko.empresa.domain.tabelapreco;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.time.LocalDate;

@Value
@Builder
@Getter
public class AtualizarTabelaPreco {
    Long id;
    Long tabelaPrecoTipoId;
    String nomeTabelaPreco;
    String descricaoTabelaPreco;
    LocalDate dataInicio;
    LocalDate dataFim;
}
