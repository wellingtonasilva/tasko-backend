package br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "cliente", schema = "crm")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clie_id")
    private Long id;

    @Column(name = "emp_id")
    private Long empresaId;

    @Column(name = "vend_id")
    private Long vendedorId;

    @Column(name = "clie_cdcliente")
    private String codigoCliente;

    @Column(name = "clie_dsrazao_social")
    private String razaoSocial;

    @Column(name = "clie_nmfantasia")
    private String nomeFantasia;

    @Column(name = "clie_nncnpj_cpf")
    private String cnpjCpf;

    @Column(name = "clie_nninscricao_estadual")
    private String inscricaoEstadual;

    @Column(name = "clie_cdtipo")
    private String tipo;

    @Column(name = "clie_dssegmento")
    private String segmento;

    @Column(name = "clie_cdcategoria")
    private String categoria;

    @Column(name = "clie_cdcep")
    private String cep;

    @Column(name = "clie_nmlogradouro")
    private String logradouro;

    @Column(name = "clie_nnlogradouro")
    private String logradouroNumero;

    @Column(name = "clie_dscomplemento")
    private String complemento;

    @Column(name = "clie_nmbairro")
    private String bairro;

    @Column(name = "clie_nmcidade")
    private String cidade;

    @Column(name = "clie_cdestado")
    private String estado;

    @Column(name = "clie_vllatitude")
    private BigDecimal latitude;

    @Column(name = "clie_vllongitude")
    private BigDecimal longitude;

    @Column(name = "clie_vllimite_credito")
    private BigDecimal limiteCredito;

    @Column(name = "clie_nnprazo_pagamento")
    private Short prazoPagamento;

    @Column(name = "clie_dtultimo_pedido")
    private LocalDate dataUltimoPedido;

    @Column(name = "clie_vlultima_compra")
    private BigDecimal valorUltimaCompra;

    @Column(name = "clie_icbloqueado")
    private Boolean bloqueado;

    @Column(name = "clie_dsmotivo_bloqueio")
    private String motivoBloqueio;

    @Column(name = "clie_nntelefone")
    private String numeroTelefone;

    @Column(name = "clie_nntelefonesecundario")
    private String numeroTelefoneSecundario;

    @Column(name = "clie_dsemail")
    private String email;

    @Column(name = "clie_dsobservacao")
    private String observacao;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "clie_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "clie_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "clie_icativo"))
    private AuditoriaEntity auditoria;
}

