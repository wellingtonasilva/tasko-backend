package br.com.wasistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface ObterVendedorPorIdPort {
    Vendedor obterPorId(Long id);
}
