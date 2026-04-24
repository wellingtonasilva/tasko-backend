package br.com.wassistemas.tasko.empresa.adapter.in.web.mapper;

import br.com.wassistemas.tasko.empresa.adapter.in.web.request.AdicionarTabelaPrecoTipoRequest;
import br.com.wassistemas.tasko.empresa.domain.tabelaprecotipo.AdicionarTabelaPrecoTipo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TabelaPrecoTipoWebMapper {
    AdicionarTabelaPrecoTipo toDomain(AdicionarTabelaPrecoTipoRequest request);
}
