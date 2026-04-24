package br.com.wassitemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface AdicionarCodigoBarrasTipoPort {
    CodigoBarrasTipo adicionarCodigoBarrasTipo(AdicionarCodigoBarrasTipo adicionar);
}
