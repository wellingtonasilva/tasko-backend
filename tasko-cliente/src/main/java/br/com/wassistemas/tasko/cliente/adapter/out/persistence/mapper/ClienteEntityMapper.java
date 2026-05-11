package br.com.wassistemas.tasko.cliente.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity.ClienteEntity;
import br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity.ClienteTabelaPrecoEntity;
import br.com.wassistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.AtualizarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClienteEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    Cliente toDomain(ClienteEntity entity);
    ClienteTabelaPreco toDomain(ClienteTabelaPrecoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataUltimoPedido", ignore = true)
    ClienteEntity toEntity(AdicionarCliente domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ClienteEntity toEntity(Long id, AtualizarCliente domain);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    ClienteTabelaPrecoEntity toEntity(AdicionarClienteTabelaPreco domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    ClienteTabelaPrecoEntity toEntity(Long id, AtualizarClienteTabelaPreco domain);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateClienteEntity(AtualizarCliente domain, @MappingTarget ClienteEntity entity);
}

