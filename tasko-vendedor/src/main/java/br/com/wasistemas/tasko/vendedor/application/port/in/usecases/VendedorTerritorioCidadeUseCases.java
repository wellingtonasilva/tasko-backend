package br.com.wasistemas.tasko.vendedor.application.port.in.usecases;

import br.com.wasistemas.tasko.common.usecases.GenericUseCase;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.AdicionarVendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;

public interface VendedorTerritorioCidadeUseCases extends GenericUseCase<VendedorTerritorioCidade,
        AdicionarVendedorTerritorioCidade, AtualizarVendedorTerritorioCidade> {
}
