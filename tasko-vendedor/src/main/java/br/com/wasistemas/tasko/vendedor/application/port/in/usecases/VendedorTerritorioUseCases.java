package br.com.wasistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface VendedorTerritorioUseCases extends GenericUseCase<VendedorTerritorio, AdicionarVendedorTerritorio, AtualizarVendedorTerritorio> {
}
