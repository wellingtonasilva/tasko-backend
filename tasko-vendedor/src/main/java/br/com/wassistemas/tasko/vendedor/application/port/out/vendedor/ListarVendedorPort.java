package br.com.wassistemas.tasko.vendedor.application.port.out.vendedor;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.domain.vendedor.Vendedor;

import java.util.List;

public interface ListarVendedorPort {
    List<Vendedor> listarVendedor(Paginacao paginacao);
}
