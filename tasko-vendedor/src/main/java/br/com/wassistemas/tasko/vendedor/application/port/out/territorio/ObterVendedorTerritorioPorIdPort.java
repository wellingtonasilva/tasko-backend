package br.com.wassistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wassistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface ObterVendedorTerritorioPorIdPort {
    VendedorTerritorio obterVendedorTerritorioPorId(Long id);
}
