package br.com.wassistemas.tasko.pedido.adapter.out.persistence.projections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface PedidoProjection {
  Long getId();
  Long getEmpresaId();
  String getNumeroPedido();
  Long getClienteId();
  Long getVendedorId();
  Long getPedidoStatusTipoId();
  LocalDateTime getDataPedido();
  LocalDate getDataEntregaPrevista();
  String getObservacao();
  BigDecimal getSubtotal();
  BigDecimal getPercentualDesconto();
  BigDecimal getValorDesconto();
  BigDecimal getValorFrete();
  BigDecimal getValorTotal();
  Long getFormaPagamentoId();
  Long gtCondicaoPagamentoId();
  BigDecimal getLatitude();
  BigDecimal getLongitude();
  Boolean getSincronizado();
  Boolean getCriadoOffline();
  String getUuidOffline();
  String getDescricaoCondicaoPagamento();
  String getDescricaoFormaPagamento();
  String getNomeVendedor();
  String getNomeFantasiaCliente();
  String getDescricaoStatusTipo();
}





  