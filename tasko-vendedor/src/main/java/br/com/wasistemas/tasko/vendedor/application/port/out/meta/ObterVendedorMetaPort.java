package br.com.wasistemas.tasko.vendedor.application.port.out.meta;

import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface ObterVendedorMetaPort {
    VendedorMeta obterVendedorMeta(Long id);
}
