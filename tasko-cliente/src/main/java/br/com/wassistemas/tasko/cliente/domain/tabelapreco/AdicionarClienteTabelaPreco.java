package br.com.wassistemas.tasko.cliente.domain.tabelapreco;

import lombok.Value;

import java.time.LocalDate;

@Value
public class AdicionarClienteTabelaPreco {
    Long clienteId;
    Long tabelaPrecoId;
    LocalDate dataInicio;
    LocalDate dataFim;
}

