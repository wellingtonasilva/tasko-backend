package br.com.wasistemas.tasko.cliente.domain.cliente;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
@Builder
@Getter
public class AtualizarCliente {
    Long id;
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
    LocalDate dataUltimoPedido;
    BigDecimal valorUltimaCompra;
    Boolean bloqueado;
    String motivoBloqueio;
}

