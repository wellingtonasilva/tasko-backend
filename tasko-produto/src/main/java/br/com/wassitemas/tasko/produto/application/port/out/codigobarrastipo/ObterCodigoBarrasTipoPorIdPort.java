package br.com.wassitemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface ObterCodigoBarrasTipoPorIdPort {
    CodigoBarrasTipo obterCodigoBarrasTipoPorId(Long id);
}
