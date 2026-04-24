package br.com.wassistemas.tasko.pedido.adapter.in.web.mapper;

import br.com.wassistemas.tasko.pedido.adapter.in.web.request.AdicionarCondicaoPagamentoRequest;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CondicaoPagamentoWebMapper {
    AdicionarCondicaoPagamento toDomain(AdicionarCondicaoPagamentoRequest request);
}
