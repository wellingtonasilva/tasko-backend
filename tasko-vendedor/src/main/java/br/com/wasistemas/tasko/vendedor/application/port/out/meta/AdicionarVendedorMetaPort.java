package br.com.wasistemas.tasko.vendedor.application.port.out.meta;

import br.com.wasistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface AdicionarVendedorMetaPort {
    VendedorMeta adicionarVendedorMeta(AdicionarVendedorMeta adicionarVendedorMeta);
}
