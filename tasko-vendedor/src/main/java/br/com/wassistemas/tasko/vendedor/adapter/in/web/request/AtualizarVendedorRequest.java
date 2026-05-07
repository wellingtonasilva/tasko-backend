package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class AtualizarVendedorRequest {
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
    boolean indicadorAtivo;
}