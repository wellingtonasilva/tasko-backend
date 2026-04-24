package br.com.wassistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wassistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface AtualizarVendedorPort {
    Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor);
}
