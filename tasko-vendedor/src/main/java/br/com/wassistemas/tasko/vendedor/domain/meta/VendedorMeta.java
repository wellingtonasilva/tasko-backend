package br.com.wassistemas.tasko.vendedor.domain.meta;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;
import lombok.Value;
import java.math.BigDecimal;

@Value
public class VendedorMeta {
    Long id;
    Vendedor vendedor;
    Integer ano;
    Integer mes;
    BigDecimal valorMeta;
    BigDecimal valorAtingido;
    Integer quantidadePedidos;
    Integer quantidadePedidosAtinigidos;
    Integer quantidadeClientesNovos;
    Integer quantidadeClientesNovosAtigidos;
    BigDecimal valorComissaoCalculada;
    Auditoria auditoria;
}