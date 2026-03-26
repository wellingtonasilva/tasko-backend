package br.com.wasistemas.tasko.cliente.domain.cliente;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class AdicionarCliente {
    Long vendedorId;
    String codigoCliente;
    String razaoSocial;
    String nomeFantasia;
    String cnpjCpf;
    String inscricaoEstadual;
    String tipo;
    String segmento;
    String categoria;
    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    BigDecimal latitude;
    BigDecimal longitude;
    BigDecimal limiteCredito;
    Short prazoPagamento;
    BigDecimal valorUltimaCompra;
    Boolean bloqueado;
    String motivoBloqueio;
}

