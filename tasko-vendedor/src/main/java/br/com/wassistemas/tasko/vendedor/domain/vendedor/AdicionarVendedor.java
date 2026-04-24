package br.com.wassistemas.tasko.vendedor.domain.vendedor;

import lombok.Value;

@Value
public class AdicionarVendedor {
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