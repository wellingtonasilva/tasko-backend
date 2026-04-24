package br.com.wassistemas.tasko.vendedor.application.port.out.meta;

import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface ObterVendedorMetaPort {
    VendedorMeta obterVendedorMeta(Long id);
}
