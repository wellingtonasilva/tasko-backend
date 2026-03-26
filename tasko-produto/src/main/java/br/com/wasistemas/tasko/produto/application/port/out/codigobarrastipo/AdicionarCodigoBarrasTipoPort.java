package br.com.wasistemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface AdicionarCodigoBarrasTipoPort {
    CodigoBarrasTipo adicionarCodigoBarrasTipo(AdicionarCodigoBarrasTipo adicionar);
}
