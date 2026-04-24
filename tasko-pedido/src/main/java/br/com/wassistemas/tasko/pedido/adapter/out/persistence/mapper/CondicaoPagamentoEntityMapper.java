package br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.CondicaoPagamentoEntity;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CondicaoPagamentoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    CondicaoPagamento toDomain(CondicaoPagamentoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    CondicaoPagamentoEntity toEntity(AdicionarCondicaoPagamento domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    CondicaoPagamentoEntity toEntity(Long id, AtualizarCondicaoPagamento domain);
}
