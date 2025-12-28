package br.com.wasistemas.vendedor.application.port.out.vendedor;

import br.com.wasistemas.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.vendedor.domain.vendedor.Vendedor;

public interface AtualizarVendedorPort {
    Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor);
}
