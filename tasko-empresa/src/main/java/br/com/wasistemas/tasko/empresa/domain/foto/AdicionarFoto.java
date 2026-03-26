package br.com.wasistemas.tasko.empresa.domain.foto;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class AdicionarFoto {
    Long entidadeTipoId;
    Long vendedorId;
    String nomeArquivo;
    String path;
    BigDecimal latitude;
    BigDecimal longitude;
    Boolean sincronizado;
}
