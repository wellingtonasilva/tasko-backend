package br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.PedidoEntity;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.projections.PedidoProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

  @Query("""
    SELECT 
      p.id as id,
      p.empresaId as empresaId,
      p.numeroPedido as numeroPedido,
      p.clienteId as clienteId,
      p.vendedorId as vendedorId,
      p.pedidoStatusTipoId as pedidoStatusTipoId,
      p.dataPedido as dataPedido,
      p.dataEntregaPrevista as dataEntregaPrevista,
      p.observacao as observacao,
      p.subtotal as subtotal,
      p.percentualDesconto as percentualDesconto,
      p.valorDesconto as valorDesconto,
      p.valorFrete as  valorFrete,
      p.valorTotal as valorTotal,
      p.formaPagamentoId as formaPagamentoId,
      p.condicaoPagamentoId as condicaoPagamentoId,
      p.latitude as latitude,
      p.longitude as longitude,
      p.sincronizado as sincronizado,
      p.criadoOffline as criadoOffline,
      p.uuidOffline as uuidOffline,
      cp.descricaoCondicaoPagamento as descricaoCondicaoPagamento,
      fp.descricaoFormaPagamento as descricaoFormaPagamento,
      rv.nomeVendedor as nomeVendedor,
      rc.nomeFantasia as nomeFantasiaCliente,
      pst.descricaoStatusTipo as descricaoStatusTipo
    FROM PedidoEntity p
      LEFT JOIN CondicaoPagamentoEntity cp ON p.condicaoPagamentoId = cp.id
      LEFT JOIN FormaPagamentoEntity fp ON p.formaPagamentoId = fp.id
      LEFT JOIN RefVendedorEntity rv ON p.vendedorId = rv.id
      LEFT JOIN RefClienteEntity rc ON p.clienteId = rc.id
      LEFT JOIN PedidoStatusTipoEntity pst ON p.pedidoStatusTipoId = pst.id
    WHERE p.empresaId = :empresaId
  """)
  Page<PedidoProjection> findByEmpresaId(Long empresaId, Pageable pageable);
}
