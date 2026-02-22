package br.com.wasistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;

public interface VendedorMetaUseCase extends GenericUseCase<VendedorMeta, AdicionarVendedorMeta,
        AtualizarVendedorMeta> {
}