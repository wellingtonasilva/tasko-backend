package br.com.wasistemas.tasko.usuario.adapter.in.web.mapper;

import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioEmpresaRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioPerfilRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioPerfilTipoRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AdicionarUsuarioRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AtualizarUsuarioEmpresaRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AtualizarUsuarioPerfilRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AtualizarUsuarioPerfilTipoRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.AtualizarUsuarioRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.request.LoginRequest;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioEmpresaResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioLoginResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioPerfilResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioPerfilTipoResponse;
import br.com.wasistemas.tasko.usuario.adapter.in.web.response.UsuarioResponse;
import br.com.wasistemas.tasko.usuario.domain.login.Login;
import br.com.wasistemas.tasko.usuario.domain.login.UsuarioLogin;
import br.com.wasistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.perfil.UsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.usuario.AdicionarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.AtualizarUsuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.Usuario;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.empresa.UsuarioEmpresa;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AdicionarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.AtualizarUsuarioPerfil;
import br.com.wasistemas.tasko.usuario.domain.usuario.perfl.UsuarioPerfil;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioWebMapper {
    AdicionarUsuario toDomain(AdicionarUsuarioRequest request);
    AtualizarUsuario toDomain(AtualizarUsuarioRequest request);
    UsuarioResponse toResponse(Usuario usuario);
    List<UsuarioResponse> toResponse(List<Usuario> usuario);

    AdicionarUsuarioEmpresa toDomain(AdicionarUsuarioEmpresaRequest request);
    AtualizarUsuarioEmpresa toDomain(AtualizarUsuarioEmpresaRequest request);
    UsuarioEmpresaResponse toResponse(UsuarioEmpresa usuarioEmpresa);
    List<UsuarioEmpresaResponse> toUsuarioEmpresaResponse(List<UsuarioEmpresa> usuarioEmpresa);

    AdicionarUsuarioPerfil toDomain(AdicionarUsuarioPerfilRequest request);
    AtualizarUsuarioPerfil toDomain(AtualizarUsuarioPerfilRequest request);
    UsuarioPerfilResponse toResponse(UsuarioPerfil usuarioPerfil);
    List<UsuarioPerfilResponse> toUsuarioPerfilResponse(List<UsuarioPerfil> usuarioPerfil);


    AdicionarUsuarioPerfilTipo toDomain(AdicionarUsuarioPerfilTipoRequest request);
    AtualizarUsuarioPerfil toDomain(AtualizarUsuarioPerfilTipoRequest request);
    UsuarioPerfilTipoResponse toResponse(UsuarioPerfilTipo usuarioPerfil);
    List<UsuarioPerfilTipoResponse> toUsuarioPerfilTipoResponse(List<UsuarioPerfilTipo> usuarioPerfil);

    Login toDomain(LoginRequest request);
    UsuarioLoginResponse toResponse(UsuarioLogin login);
}
