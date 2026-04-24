package br.com.wassistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarTabelaPrecoRequest;
import br.com.wassistemas.tasko.empresa.domain.tabelapreco.AdicionarTabelaPreco;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TabelaPrecoWebMapper {
    AdicionarTabelaPreco toDomain(AdicionarTabelaPrecoRequest request);
}
