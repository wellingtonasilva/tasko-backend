package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface VendedorMetaUseCase extends BaseUseCase<VendedorMeta, AdicionarVendedorMeta,
        AtualizarVendedorMeta> {
}