package br.com.wasistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wasistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;

public interface AdicionarVendedorPort {
    Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor);
}
