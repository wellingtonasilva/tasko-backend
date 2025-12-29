package br.com.wasistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface VendedorUseCases extends GenericUseCase<Vendedor, AdicionarVendedor, AtualizarVendedor > {
}
