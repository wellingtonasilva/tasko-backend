package br.com.wasistemas.tasko.pedido.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity.PedidoStatusTipoEntity;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoStatusTipoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    PedidoStatusTipo toDomain(PedidoStatusTipoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    PedidoStatusTipoEntity toEntity(AdicionarPedidoStatusTipo domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    PedidoStatusTipoEntity toEntity(Long id, AtualizarPedidoStatusTipo domain);
}
