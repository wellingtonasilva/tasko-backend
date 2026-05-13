package br.com.wassistemas.tasko.agenda.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.agenda.adapter.out.persistence.entity.AgendaVisitaEntity;
import br.com.wassistemas.tasko.agenda.adapter.out.persistence.projections.AgendaVisitaProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AgendaVisitaRepository extends JpaRepository<AgendaVisitaEntity, Long> {

  @Query("""
    SELECT
      a.id as id,
      a.empresaId as empresaId,
      a.dataAgendada as dataAgendada,
      a.dataRealizada as dataRealizada,
      a.duracaoPrevista as duracaoPrevista,
      a.duracaoReal as duracaoReal,
      a.objetivo as objetivo,
      a.observacao as observacao,
      a.resultado as resultado,
      a.vendedorId as vendedorId,
      a.clienteId as clienteId,
      a.agendaVisitaStatusId as agendaVisitaStatusId,
      a.latitude as latitude,
      a.longitude as longitude,
      a.pedidoGerado as pedidoGerado,
      a.pedidoId as pedidoId,
      a.valorPedido as valorPedido,
      a.sincronizado as sincronizado,
      a.criadoOffline as criadoOffline,
      a.uuidOffline as uuidOffline,
      c.razaoSocial as razaoSocial,
      v.nomeVendedor as nomeVendedor,
      s.descricaoVisitaStatus as descricaoVisitaStatus
    FROM AgendaVisitaEntity a
    LEFT JOIN RefClienteEntity c ON a.clienteId = c.id
    LEFT JOIN RefVendedorEntity v ON a.vendedorId = v.id
    LEFT JOIN AgendaVisitaStatusEntity s ON a.agendaVisitaStatusId = s.id
    WHERE a.empresaId = :empresaId
  """)
  Page<AgendaVisitaProjection> findByEmpresaId(Long empresaId, Pageable pageable);
}
