package br.com.wasistemas.tasko.cliente.domain.tabelapreco;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
@Getter
public class AtualizarClienteTabelaPreco {
    Long id;
    Long clienteId;
    Long tabelaPrecoId;
    LocalDate dataInicio;
    LocalDate dataFim;
}

