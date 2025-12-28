package br.com.wasistemas.vendedor.application.port.out.vendedor;

import br.com.wasistemas.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.vendedor.domain.vendedor.Vendedor;

public interface AdicionarVendedorPort {
    Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor);
}
