package br.com.wassistemas.tasko.vendedor.application.port.out.territorio.cidade;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;

import java.util.List;

public interface ListarVendedorTerritorioCidadePort {
    List<VendedorTerritorioCidade> listarVendedorTerritorioCidade(Paginacao paginacao);
}
