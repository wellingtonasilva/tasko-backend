package br.com.wassistemas.tasko.agenda.adapter.out.persistence.projections;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface AgendaVisitaProjection {
  Long getId();
  Long getEmpresaId();
  LocalDateTime getDataAgendada();
  LocalDateTime getDataRealizada();
  Integer getDuracaoPrevista();
  Integer getDuracaoReal();
  String getObjetivo();
  String getObservacao();
  String getResultado();
  Long getVendedorId();
  Long getClienteId();
  Long getAgendaVisitaStatusId();
  BigDecimal getLatitude();
  BigDecimal getLongitude();
  Boolean getPedidoGerado();
  Long getPedidoId();
  BigDecimal getValorPedido();
  Boolean getSincronizado();
  Boolean getCriadoOffline();
  String getUuidOffline();
  String getRazaoSocial();
  String getNomeVendedor();
  String getDescricaoVisitaStatus();
}
