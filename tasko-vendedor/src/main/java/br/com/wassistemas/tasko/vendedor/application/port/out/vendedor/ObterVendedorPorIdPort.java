package br.com.wassistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface ObterVendedorPorIdPort {
    Vendedor obterPorId(Long id);
}
