package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.TenantUseCase;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AdicionarVendedorTerritorio;
import br.com.wassistemas.tasko.vendedor.domain.territorio.AtualizarVendedorTerritorio;
import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;

public interface VendedorTerritorioUseCases extends
    TenantUseCase<VendedorTerritorio, AdicionarVendedorTerritorio, AtualizarVendedorTerritorio> {
}
