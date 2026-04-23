package br.com.wasistemas.tasko.usuario.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.entity.EmpresaEntity;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEmpresaEntity;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioEntity;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilEntity;
import br.com.wasistemas.tasko.usuario.adapter.out.persistence.entity.UsuarioPerfilTipoEntity;
import br.com.wasistemas.tasko.usuario.domain.perfil.AdicionarUsuarioPerfilTipo;
import br.com.wasistemas.tasko.usuario.domain.perfil.AtualizarUsuarioPerfilTipo;
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
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorEntity;
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
    @Mapping(target = "vendedor", source = "domain.vendedorId", qualifiedByName="mapVendedorId")
    UsuarioEntity toEntity(Long id, AtualizarUsuario domain);

    UsuarioEntity toEntity(Usuario domain);

    Usuario toDomain(UsuarioEntity domain);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "usuario", source = "domain.usuarioId", qualifiedByName="mapUsuarioId")
    @Mapping(target = "empresa", source = "domain.empresaId", qualifiedByName="mapEmpresaId")
    @Mapping(target = "id", ignore = true)
    UsuarioEmpresaEntity toEntity(AdicionarUsuarioEmpresa domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "usuario", source = "domain.usuarioId", qualifiedByName="mapUsuarioId")
    @Mapping(target = "empresa", source = "domain.empresaId", qualifiedByName="mapEmpresaId")
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
    @Mapping(target = "id", ignore = true)
    UsuarioPerfilEntity toEntity(AdicionarUsuarioPerfil domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    UsuarioPerfilEntity toEntity(Long id, AtualizarUsuarioPerfil domain);

    UsuarioPerfil toDomain(UsuarioPerfilEntity domain);

    @Named("mapVendedorId")
    default VendedorEntity mapVendedorId(Long vendedorId) {
        if (vendedorId == null) {
            return null;
        }
        VendedorEntity vendedor = new VendedorEntity();
        vendedor.setId(vendedorId);
        return vendedor;
    }

    @Named("mapUsuarioId")
    default UsuarioEntity mapUsuarioId(Long usuarioId) {
        if (usuarioId == null) {
            return null;
        }
        UsuarioEntity entity = new UsuarioEntity();
        entity.setId(usuarioId);

        return entity;
    }

    @Named("mapEmpresaId")
    default EmpresaEntity mapEmpresaId(Long empresaId) {
        if (empresaId == null) {
            return null;
        }
        EmpresaEntity entity = new EmpresaEntity();
        entity.setId(empresaId);

        return entity;
    }
}
