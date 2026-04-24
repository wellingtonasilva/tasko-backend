package br.com.wassistemas.tasko.vendedor.domain.vendedor;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Builder
@Getter
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
    private Long supervisorId;
    private Long territorioId;
}