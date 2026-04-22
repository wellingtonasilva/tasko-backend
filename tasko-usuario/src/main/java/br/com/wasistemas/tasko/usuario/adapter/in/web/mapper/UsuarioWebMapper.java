package br.com.wasistemas.tasko.usuario.adapter.in.web.mapper;

import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AtualizarUsuarioRequest;
import br.com.wasistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioWebMapper {
    UsuarioWebMapper INSTANCE = Mappers.getMapper(UsuarioWebMapper.class);

    AdicionarUsuario toDomain(AdicionarUsuarioRequest request);
    AtualizarUsuario toDomain(AtualizarUsuarioRequest request);
}
