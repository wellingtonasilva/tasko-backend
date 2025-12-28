package br.com.wasistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wasistemas.tasko.vendedor.domain.vendedor.AtualizarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface AtualizarVendedorPort {
    Vendedor atualizar(Long id, AtualizarVendedor atualizarVendedor);
}
