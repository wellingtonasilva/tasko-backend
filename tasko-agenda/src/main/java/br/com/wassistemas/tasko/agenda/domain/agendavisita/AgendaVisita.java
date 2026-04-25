package br.com.wassistemas.tasko.agenda.domain.agendavisita;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class AgendaVisita {
    private Long id;
    private Long empresaId;
    private LocalDateTime dataAgendada;
    private LocalDateTime dataRealizada;
    private Integer duracaoPrevista;
    private Integer duracaoReal;
    private String objetivo;
    private String observacao;
    private String resultado;
    private Long vendedorId;
    private Long clienteId;
    private Long agendaVisitaStatusId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Boolean pedidoGerado;
    private Long pedidoId;
    private BigDecimal valorPedido;
    private Boolean sincronizado;
    private Boolean criadoOffline;
    private String uuidOffline;
    private Auditoria auditoria;
}
