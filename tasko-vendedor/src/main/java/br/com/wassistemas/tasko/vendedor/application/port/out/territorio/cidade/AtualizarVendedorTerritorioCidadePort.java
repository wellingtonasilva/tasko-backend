package br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade;

import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.AtualizarVendedorTerritorioCidade;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;

public interface AtualizarVendedorTerritorioCidadePort {
    VendedorTerritorioCidade AtualizarVendedorTerritorioCidade(Long id, AtualizarVendedorTerritorioCidade atualizarVendedorTerritorioCidade);
}
