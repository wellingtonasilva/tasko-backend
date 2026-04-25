package br.com.wassistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wassistemas.tasko.common.domain.vendedor.VendedorTerritorio;

public interface ObterVendedorTerritorioPorIdPort {
    VendedorTerritorio obterVendedorTerritorioPorId(Long id);
}
