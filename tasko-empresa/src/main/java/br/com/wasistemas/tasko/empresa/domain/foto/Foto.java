package br.com.wasistemas.tasko.empresa.domain.foto;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class Foto {
    private Long id;
    private Long entidadeTipoId;
    private Long vendedorId;
    private String nomeArquivo;
    private String path;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Boolean sincronizado;
    private Auditoria auditoria;
}
