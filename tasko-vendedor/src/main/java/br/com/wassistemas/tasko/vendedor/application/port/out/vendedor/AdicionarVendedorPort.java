package br.com.wassistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wassistemas.tasko.vendedor.domain.vendedor.AdicionarVendedor;
import br.com.wassistemas.tasko.common.domain.vendedor.Vendedor;

public interface AdicionarVendedorPort {
    Vendedor adicionarVendedor(AdicionarVendedor adicionarVendedor);
}
