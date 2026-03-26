package br.com.wasistemas.tasko.pedido.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.pedido.adapter.out.persistence.entity.FormaPagamentoEntity;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wasistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FormaPagamentoEntityMapper {

    Auditoria toDomain(AuditoriaEntity entity);
    FormaPagamento toDomain(FormaPagamentoEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    FormaPagamentoEntity toEntity(AdicionarFormaPagamento domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    FormaPagamentoEntity toEntity(Long id, AtualizarFormaPagamento domain);
}
