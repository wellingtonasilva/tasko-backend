package br.com.wassistemas.tasko.vendedor.application.port.out.meta;

import br.com.wassistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface AdicionarVendedorMetaPort {
    VendedorMeta adicionarVendedorMeta(AdicionarVendedorMeta adicionarVendedorMeta);
}
