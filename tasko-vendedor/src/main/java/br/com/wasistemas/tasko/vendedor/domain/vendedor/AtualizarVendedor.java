package br.com.wasistemas.vendedor.domain.vendedor;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AtualizarVendedor {
    private Long id;
    private String codigoVendedor;
    private String nomeVendedor;
    private String numeroCPF;
    private String email;
    private String numeroTelefone;
    private Float valorMetaMensal;
    private Float percentualComissao;
    private LocalDateTime ultimoSincronismo;
    private String codigoDispositivo;
    private Long supervsupervisorIdisor;
    private Long territorioId;
}