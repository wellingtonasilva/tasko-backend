package br.com.wasistemas.vendedor.adapter.in.web.request;

import lombok.Value;

@Value
public class AdicionarVendedorRequest {
    Long id;
    String codigoVendedor;
    String nomeVendedor;
    String numeroCPF;
    String email;
    String numeroTelefone;
    Float valorMetaMensal;
    Float percentualComissao;
    Long supervisorId;
    Long territorioId;
}