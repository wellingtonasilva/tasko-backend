package br.com.wasistemas.tasko.vendedor.application.port.out.meta;

import br.com.wasistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface AtualizarVendedorMetaPort {
    VendedorMeta atualizarVendedorMeta(AtualizarVendedorMeta atualizarVendedorMeta);
}
