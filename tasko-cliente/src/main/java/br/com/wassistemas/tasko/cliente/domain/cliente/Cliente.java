package br.com.wassistemas.tasko.cliente.domain.cliente;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class Cliente {
    private Long id;
    private Long empresaId;
    private Long vendedorId;
    private String codigoCliente;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpjCpf;
    private String inscricaoEstadual;
    private String tipo;
    private String segmento;
    private String categoria;
    private String cep;
    private String logradouro;
    private String logradouroNumero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal limiteCredito;
    private Short prazoPagamento;
    private LocalDate dataUltimoPedido;
    private BigDecimal valorUltimaCompra;
    private Boolean bloqueado;
    private String motivoBloqueio;
    private String numeroTelefone;
    private String numeroTelefoneSecundario;
    private String email;
    private String observacao;
    private Auditoria auditoria;
}

