package br.com.wasistemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface AtualizarCodigoBarrasTipoPort {
    CodigoBarrasTipo atualizarCodigoBarrasTipo(Long id, AtualizarCodigoBarrasTipo atualizar);
}
