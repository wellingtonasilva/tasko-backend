package br.com.wasistemas.vendedor.application.port.out.vendedor;

import br.com.wasistemas.vendedor.domain.vendedor.Vendedor;

public interface ObterVendedorPorIdPort {
    Vendedor obterPorId(Long id);
}
