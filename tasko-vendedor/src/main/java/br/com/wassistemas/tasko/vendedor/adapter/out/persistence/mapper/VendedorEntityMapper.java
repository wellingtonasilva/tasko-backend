package br.com.wassistemas.tasko.vendedor.adapter.out.persistence.mapper;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorEntity;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorMetaEntity;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorSupervisorEntity;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioCidadeEntity;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioEntity;
import br.com.wassistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorEntityMapper {
    Auditoria toDomain(AuditoriaEntity entity);
    VendedorSupervisor toDomain(VendedorSupervisorEntity entity);
    VendedorTerritorio toDomain(VendedorTerritorioEntity entity);
    VendedorTerritorioCidade toDomain(VendedorTerritorioCidadeEntity entity);
    Vendedor toDomain(VendedorEntity entity);
    VendedorMeta toDomain(VendedorMetaEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    VendedorSupervisorEntity toEntity(AdicionarVendedorSupervisor domain);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "supervisor", source = "domain.supervisorId", qualifiedByName="mapSupervisorId")
    VendedorTerritorioEntity toEntity(AdicionarVendedorTerritorio domain);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "territorio", source = "domain.territorioId", qualifiedByName="mapVendedorTerritorioId")
    VendedorTerritorioCidadeEntity toEntity(AdicionarVendedorTerritorioCidade domain);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "supervisor", source = "domain.supervisorId", qualifiedByName="mapSupervisorId")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ultimoSincronismo", ignore = true)
    @Mapping(target = "codigoDispositivo", ignore = true)
    @Mapping(target = "territorio", source = "domain.territorioId", qualifiedByName = "mapVendedorTerritorioId")
    VendedorEntity toEntity(AdicionarVendedor domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "supervisor", source = "domain.supervisorId", qualifiedByName="mapSupervisorId")
    @Mapping(target = "territorio", source = "domain.territorioId", qualifiedByName = "mapVendedorTerritorioId")
    VendedorEntity toEntity(Long id, AtualizarVendedor domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "supervisor", source = "domain.supervisorId", qualifiedByName="mapSupervisorId")
    VendedorTerritorioEntity toEntity(Long id, AtualizarVendedorTerritorio domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    VendedorSupervisorEntity toEntity(Long id, AtualizarVendedorSupervisor domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "territorio", source = "domain.territorioId", qualifiedByName="mapVendedorTerritorioId")
    VendedorTerritorioCidadeEntity toEntity(Long id, AtualizarVendedorTerritorioCidade domain);

    @Mapping(target = "vendedor", source = "domain.vendedorId", qualifiedByName="mapVendedorId")
    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    VendedorMetaEntity toEntity(AdicionarVendedorMeta domain);

    @Mapping(target = "vendedor", source = "domain.vendedorId", qualifiedByName="mapVendedorId")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    VendedorMetaEntity toEntity(Long id, AtualizarVendedorMeta domain);

    @Named("mapVendedorId")
    default VendedorEntity mapVendedorId(Long vendedorId) {
        if (vendedorId == null) {
            return null;
        }
        VendedorEntity vendedor = new VendedorEntity();
        vendedor.setId(vendedorId);
        return vendedor;
    }

    @Named("mapSupervisorId")
    default VendedorSupervisorEntity mapSupervisorId(Long supervisorId) {
        if (supervisorId == null) {
            return null;
        }
        VendedorSupervisorEntity supervisor = new VendedorSupervisorEntity();
        supervisor.setId(supervisorId);
        return supervisor;
    }

    @Named("mapVendedorTerritorioId")
    default VendedorTerritorioEntity mapVendedorTerritorioId(Long territorioId) {
        if (territorioId == null) {
            return null;
        }
        VendedorTerritorioEntity vendedorTerritorio = new VendedorTerritorioEntity();
        vendedorTerritorio.setId(territorioId);
        return vendedorTerritorio;
    }
}
