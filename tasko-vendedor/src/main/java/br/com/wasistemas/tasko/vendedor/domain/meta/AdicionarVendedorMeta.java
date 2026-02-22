package br.com.wasistemas.tasko.vendedor.domain.meta;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class AdicionarVendedorMeta {
    Long vendedorId;
    Integer ano;
    Integer mes;
    BigDecimal valorMeta;
    BigDecimal valorAtingido;
    Integer quantidadePedidos;
    Integer quantidadePedidosAtinigidos;    
    Integer quantidadeClientesNovos;
    Integer quantidadeClientesNovosAtigidos;
    BigDecimal valorComissaoCalculada;
}