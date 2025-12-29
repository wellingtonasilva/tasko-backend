package br.com.wasistemas.tasko.vendedor.application.port.out.territorio.cidade;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.territorio.cidade.VendedorTerritorioCidade;

import java.util.List;

public interface ListarVendedorTerritorioCidadePort {
    List<VendedorTerritorioCidade> listarVendedorTerritorioCidade(Paginacao paginacao);
}
