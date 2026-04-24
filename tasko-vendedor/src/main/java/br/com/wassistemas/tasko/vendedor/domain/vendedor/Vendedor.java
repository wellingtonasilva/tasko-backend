package br.com.wassistemas.tasko.vendedor.domain.vendedor;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.vendedor.domain.supervisor.VendedorSupervisor;
import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class Vendedor {
    private Long id;
    private String codigoVendedor;
    private String nomeVendedor;
    private String numeroCPF;
    private String email;
    private String numeroTelefone;
    private Float valorMetaMensal;
    private Float percentualComissao;
    private LocalDateTime ultimoSincronismo;
    private String codigoDispositivo;
    private VendedorSupervisor supervisor;
    private VendedorTerritorio territorio;
    private Auditoria auditoria;
}