package br.com.wasistemas.tasko.cliente.adapter.in.web.mapper;

import br.com.wasistemas.tasko.cliente.adapter.in.web.request.AdicionarClienteTabelaPrecoRequest;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClienteTabelaPrecoWebMapper {
    AdicionarClienteTabelaPreco toDomain(AdicionarClienteTabelaPrecoRequest request);
}

