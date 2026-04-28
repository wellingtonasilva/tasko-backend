package br.com.wassistemas.tasko.usuario.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEmpresaEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilTipoEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioResetTokenEntity;
import br.com.wassistemas.tasko.usuario.domain.login.CriarResetToken;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLogin;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLoginEmpresa;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioLoginPerfil;
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

  @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "id", ignore = true)
  UsuarioEntity toEntity(AdicionarUsuario domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioEntity toEntity(Long id, AtualizarUsuario domain);

  UsuarioEntity toEntity(Usuario domain);

  //@Mapping(target = "perfis", qualifiedByName = "toListIgnoreUsuario")
  Usuario toDomain(UsuarioEntity domain);

  @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "usuario", source = "domain.usuarioId", qualifiedByName = "mapUsuarioId")
  @Mapping(target = "id", ignore = true)
  UsuarioEmpresaEntity toEntity(AdicionarUsuarioEmpresa domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "usuario", source = "domain.usuarioId", qualifiedByName = "mapUsuarioId")
  UsuarioEmpresaEntity toEntity(Long id, AtualizarUsuarioEmpresa domain);

  UsuarioEmpresa toDomain(UsuarioEmpresaEntity domain);

  @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "id", ignore = true)
  UsuarioPerfilTipoEntity toEntity(AdicionarUsuarioPerfilTipo domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioPerfilTipoEntity toEntity(Long id, AtualizarUsuarioPerfilTipo domain);

  UsuarioPerfilTipo toDomain(UsuarioPerfilTipoEntity domain);

  @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  @Mapping(target = "usuario", source = "domain.usuarioId", qualifiedByName = "mapUsuarioId")
  @Mapping(target = "perfilTipo", source = "domain.perfilTipo", qualifiedByName = "mapPerfilTipoEntity")
  @Mapping(target = "id", ignore = true)
  UsuarioPerfilEntity toEntity(AdicionarUsuarioPerfil domain);

  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  UsuarioPerfilEntity toEntity(Long id, AtualizarUsuarioPerfil domain);

  @Mapping(target = "perfilTipo", source = "entity.perfilTipo", qualifiedByName = "mapPerfilTipo")
  @Mapping(target = "usuario", ignore = true)
  UsuarioPerfil toDomain(UsuarioPerfilEntity entity);

  @Named("toListIgnoreUsuario")
  @Mapping(target = "usuario", ignore = true)
  List<UsuarioPerfil> toListIgnoreUsuario(List<UsuarioPerfilEntity> entity);

  UsuarioLogin toUsuarioLogin(UsuarioEntity entity);

  @Mapping(target = "perfilTipo", source = "entity.perfilTipo", qualifiedByName = "mapPerfilTipo")
  UsuarioLoginPerfil toUsuarioLoginPerfil(UsuarioPerfilEntity entity);
  List<UsuarioLoginPerfil> toListUsuarioLoginPerfil(List<UsuarioPerfilEntity> entity);

  UsuarioLoginEmpresa toUsuarioLoginEmpresa(UsuarioEmpresaEntity entity);
  List<UsuarioLoginEmpresa> toUsuarioLoginEmpresa(List<UsuarioEmpresaEntity> entity);

  @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
  @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
  UsuarioResetTokenEntity toEntity(CriarResetToken domain);

  UsuarioResetToken toDomain(UsuarioResetTokenEntity entity);

  @Named("mapUsuarioId")
  default UsuarioEntity mapUsuarioId(Long usuarioId) {
    if (usuarioId == null) {
      return null;
    }
    UsuarioEntity entity = new UsuarioEntity();
    entity.setId(usuarioId);

    return entity;
  }

  @Named("mapPerfilTipo")
  default PerfilTipo mapPerfilTipo(UsuarioPerfilTipoEntity value) {
    if (value == null) {
      return null;
    }
    return PerfilTipo.from(value.getId().intValue());
  }

  @Named("mapPerfilTipoEntity")
  default UsuarioPerfilTipoEntity mapPerfilTipoEntity(PerfilTipo value) {
    if (value == null) {
      return null;
    }
    UsuarioPerfilTipoEntity entity = new UsuarioPerfilTipoEntity();
    entity.setId((long) value.ordinal());
    return entity;
  }
}
