package br.com.wassistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.GenericUseCase;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;

public interface VendedorTerritorioCidadeUseCases extends GenericUseCase<VendedorTerritorioCidade,
        AdicionarVendedorTerritorioCidade, AtualizarVendedorTerritorioCidade> {
}
