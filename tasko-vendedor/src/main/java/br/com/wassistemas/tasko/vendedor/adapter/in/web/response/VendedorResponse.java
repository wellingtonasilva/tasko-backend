package br.com.wassistemas.tasko.vendedor.adapter.in.web.response;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class VendedorResponse {
    private Long id;
    private Long empresaId;
    private String codigoVendedor;
    private String nomeVendedor;
    private String numeroCPF;
    private String email;
    private String numeroTelefone;
    private Float valorMetaMensal;
    private Float percentualComissao;
    private LocalDateTime ultimoSincronismo;
    private String codigoDispositivo;
    private VendedorSupervisorResponse supervisor;
    private VendedorTerritorioResponse territorio;
    private Auditoria auditoria;
}