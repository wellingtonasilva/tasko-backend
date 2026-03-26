package br.com.wasistemas.tasko.empresa.domain.foto;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import java.math.BigDecimal;

@Value
@Builder
@Getter
public class AtualizarFoto {
    Long id;
    Long entidadeTipoId;
    Long vendedorId;
    String nomeArquivo;
    String path;
    BigDecimal latitude;
    BigDecimal longitude;
    Boolean sincronizado;
}
