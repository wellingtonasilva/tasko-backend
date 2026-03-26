package br.com.wasistemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface ObterCodigoBarrasTipoPorIdPort {
    CodigoBarrasTipo obterCodigoBarrasTipoPorId(Long id);
}
