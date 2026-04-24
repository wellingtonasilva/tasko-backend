package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface VendedorUseCases extends GenericUseCase<Vendedor, AdicionarVendedor, AtualizarVendedor > {
}
