package br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade;

import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;

public interface ObterVendedorTerritorioCidadePorIdPort {
    VendedorTerritorioCidade obterVendedorTerritorioCidadePorId(Long id);
}
