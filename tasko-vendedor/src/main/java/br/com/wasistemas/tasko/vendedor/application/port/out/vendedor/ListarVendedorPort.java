package br.com.wasistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wasistemas.tasko.vendedor.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.vendedor.Vendedor;

import java.util.List;

public interface ListarVendedorPort {
    List<Vendedor> listarVendedor(Paginacao paginacao);
}
