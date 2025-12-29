package br.com.wasistemas.tasko.vendedor.application.port.out.territorio;

import br.com.wasistemas.tasko.vendedor.domain.territorio.VendedorTerritorio;

public interface ObterVendedorTerritorioPorIdPort {
    VendedorTerritorio obterVendedorTerritorioPorId(Long id);
}
