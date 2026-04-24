package br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.PedidoItemEntity;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoItemEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    PedidoItem toDomain(PedidoItemEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    PedidoItemEntity toEntity(AdicionarPedidoItem domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    PedidoItemEntity toEntity(Long id, AtualizarPedidoItem domain);
}
