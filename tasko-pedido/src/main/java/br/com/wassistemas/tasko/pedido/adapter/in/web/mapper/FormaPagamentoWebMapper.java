package br.com.wassistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarFormaPagamentoRequest;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FormaPagamentoWebMapper {
    AdicionarFormaPagamento toDomain(AdicionarFormaPagamentoRequest request);
}
