package br.com.wassistemas.tasko.cliente.domain.tabelapreco;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClienteTabelaPreco {
    private Long id;
    private Long clienteId;
    private Long tabelaPrecoId;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Auditoria auditoria;
}

