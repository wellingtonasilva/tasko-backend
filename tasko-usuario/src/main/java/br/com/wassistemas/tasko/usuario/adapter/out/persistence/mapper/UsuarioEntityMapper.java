package br.com.wassistemas.tasko.usuario.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import br.com.wassistemas.tasko.common.enumerations.PerfilTipo;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEmpresaEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilTipoEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioResetTokenEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity.VendedorRefEntity;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections.UsuarioDetalhadoProjection;
import br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections.UsuarioPerfilProjection;
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
import java.util.Objects;
import java.util.stream.Collectors;
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

  Usuario toDomain(UsuarioEntity domain);

  Vendedor toVendedor(VendedorRefEntity entity);

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

  default Usuario toDomain(UsuarioDetalhadoProjection usuario, List<UsuarioPerfilProjection> perfis) {
    if (usuario == null) {
      return null;
    }

    return Usuario.builder()
        .id(usuario.getId())
        .nomeUsuario(usuario.getNomeUsuario())
        .vendedor(toVendedor(usuario))
        .numeroTelefone(usuario.getNumeroTelefone())
        .nomeCompleto(usuario.getNomeCompleto())
        .perfis(toPerfis(perfis))
        .auditoria(toAuditoria(usuario.getCriadoEm(), usuario.getAtualizadoEm(),
            usuario.getIndicadorAtivo()))
        .build();
  }

  default Vendedor toVendedor(UsuarioDetalhadoProjection usuario) {
    if (usuario == null || usuario.getVendedorId() == null) {
      return null;
    }

    return Vendedor.builder()
        .id(usuario.getVendedorId())
        .codigoVendedor(usuario.getVendedorCodigo())
        .nomeVendedor(usuario.getVendedorNome())
        .numeroCPF(usuario.getVendedorCpf())
        .email(usuario.getVendedorEmail())
        .numeroTelefone(usuario.getVendedorTelefone())
        .build();
  }

  default List<UsuarioPerfil> toPerfis(List<UsuarioPerfilProjection> perfis) {
    if (perfis == null) {
      return List.of();
    }

    return perfis.stream()
        .filter(Objects::nonNull)
        .map(perfil -> UsuarioPerfil.builder()
            .id(perfil.getId())
            .perfilTipo(perfil.getPerfilTipoId() == null
                ? null
                : PerfilTipo.from(perfil.getPerfilTipoId().intValue()))
            .auditoria(toAuditoria(perfil.getCriadoEm(), perfil.getAtualizadoEm(),
                perfil.getIndicadorAtivo()))
            .build())
        .collect(Collectors.toList());
  }

  default Auditoria toAuditoria(java.time.LocalDateTime criadoEm,
      java.time.LocalDateTime atualizadoEm, Boolean indicadorAtivo) {
    return Auditoria.builder()
        .criadoEm(criadoEm)
        .atualizadoEm(atualizadoEm)
        .indicadorAtivo(indicadorAtivo)
        .build();
  }
}
