package br.com.wasistemas.vendedor.application.port.out.vendedor;

import br.com.wasistemas.vendedor.domain.Paginacao;
import br.com.wasistemas.vendedor.domain.vendedor.Vendedor;

import java.util.List;

public interface ListarVendedorPort {
    List<Vendedor> listarVendedor(Paginacao paginacao);
}
