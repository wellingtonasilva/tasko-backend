package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface VendedorMetaUseCase extends GenericUseCase<VendedorMeta, AdicionarVendedorMeta,
        AtualizarVendedorMeta> {
}