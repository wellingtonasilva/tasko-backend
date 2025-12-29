package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.common.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorEntity;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorSupervisorEntity;
import br.com.wasistemas.tasko.common.domain.Auditoria;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioCidadeEntity;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorTerritorioEntity;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AtualizarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorMapper {
    Auditoria toDomain(AuditoriaEntity entity);

    VendedorSupervisor toDomain(VendedorSupervisorEntity entity);
    VendedorTerritorio toDomain(VendedorTerritorioEntity entity);
    VendedorTerritorioCidade toDomain(VendedorTerritorioCidadeEntity entity);

    Vendedor toDomain(VendedorEntity entity);

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
