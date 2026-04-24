package br.com.wassistemas.tasko.vendedor.application.port.out.meta;

import br.com.wassistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface AtualizarVendedorMetaPort {
    VendedorMeta atualizarVendedorMeta(Long id, AtualizarVendedorMeta atualizarVendedorMeta);
}
