package br.com.wassistemas.tasko.usuario.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEmpresaEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilTipoEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioResetTokenEntity;
import br.com.wassistemas.tasko.usuario.domain.login.CriarResetToken;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;
import br.com.wassistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfilTipo;
import br.com.wassistemas.tasko.common.domain.usuario.AdicionarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.AtualizarUsuario;
import br.com.wassistemas.tasko.common.domain.usuario.Usuario;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AdicionarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.AtualizarUsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.empresa.UsuarioEmpresa;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.AdicionarUsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.AtualizarUsuarioPerfil;
import br.com.wassistemas.tasko.common.domain.usuario.perfil.UsuarioPerfil;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioEntityMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  UsuarioEntity toEntity(AdicionarUsuario domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioEntity toEntity(Long id, AtualizarUsuario domain);

  UsuarioEntity toEntity(Usuario domain);

  Usuario toDomain(UsuarioEntity domain);

  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "id", ignore = true)
  UsuarioEmpresaEntity toEntity(AdicionarUsuarioEmpresa domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioEmpresaEntity toEntity(Long id, AtualizarUsuarioEmpresa domain);

  UsuarioEmpresa toDomain(UsuarioEmpresaEntity domain);

  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "id", ignore = true)
  UsuarioPerfilTipoEntity toEntity(AdicionarUsuarioPerfilTipo domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioPerfilTipoEntity toEntity(Long id, AtualizarUsuarioPerfilTipo domain);

  UsuarioPerfilTipo toDomain(UsuarioPerfilTipoEntity domain);

  @Mapping(target = "perfilTipo", source = "entity.perfilTipoId", qualifiedByName = "mapPerfilTipo")
  UsuarioPerfil toDomain(UsuarioPerfilEntity entity);

  List<UsuarioPerfil> toDomain(List<UsuarioPerfilEntity> entities);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "perfilTipoId", source = "domain.perfilTipo", qualifiedByName = "mapPerfilTipoId")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  UsuarioPerfilEntity toEntity(AdicionarUsuarioPerfil domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioPerfilEntity toEntity(Long id, AtualizarUsuarioPerfil domain);


  UsuarioLogin toUsuarioLogin(UsuarioEntity entity);

  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  UsuarioResetTokenEntity toEntity(CriarResetToken domain);

  UsuarioResetToken toDomain(UsuarioResetTokenEntity entity);

  @Named("mapPerfilTipo")
  default PerfilTipo mapPerfilTipo(Long value) {
    if (value == null) {
      return null;
    }
    return PerfilTipo.from(value.intValue());
  }

  @Named("mapPerfilTipoId")
  default Long mapPerfilTipoId(PerfilTipo value) {
    if (value == null) {
      return null;
    }
    return (long) value.ordinal();
  }
}
