package br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.PedidoEntity;
import br.com.wassistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    Pedido toDomain(PedidoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    PedidoEntity toEntity(AdicionarPedido domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    PedidoEntity toEntity(Long id, AtualizarPedido domain);
}
