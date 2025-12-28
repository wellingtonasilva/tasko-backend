package br.com.wasistemas.tasko.vendedor.adapter.out.persistence.mapper;

import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.AuditoriaEntity;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorEntity;
import br.com.wasistemas.tasko.vendedor.adapter.out.persistence.entity.VendedorSupervisorEntity;
import br.com.wasistemas.tasko.vendedor.domain.Auditoria;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.AdicionarVendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VendedorMapper {
    Auditoria toDomain(AuditoriaEntity entity);

    VendedorSupervisor toDomain(VendedorSupervisorEntity entity);

    Vendedor toDomain(VendedorEntity entity);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "id", ignore = true)
    VendedorSupervisorEntity toEntity(AdicionarVendedorSupervisor domain);

    @Mapping(target = "auditoria.criadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "auditoria.indicadorAtivo", expression = "java(Boolean.TRUE)")
    @Mapping(target = "supervisor", source = "supervisorId")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ultimoSincronismo", ignore = true)
    @Mapping(target = "codigoDispositivo", ignore = true)
    @Mapping(target = "territorio", ignore = true)
    VendedorEntity toEntity(AdicionarVendedor domain);

    @Mapping(target = "auditoria.atualizadoEm", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "supervisor", ignore = true)
    @Mapping(target = "territorio", ignore = true)
    VendedorEntity toEntity(Long id, AtualizarVendedor domain);

    default VendedorSupervisorEntity mapSupervisorId(Long supervisorId) {
        if (supervisorId == null) {
            return null;
        }
        VendedorSupervisorEntity supervisor = new VendedorSupervisorEntity();
        supervisor.setId(supervisorId);
        return supervisor;
    }
}
