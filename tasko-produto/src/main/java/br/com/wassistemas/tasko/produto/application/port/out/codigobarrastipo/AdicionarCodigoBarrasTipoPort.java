package br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wassistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wassistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface AdicionarCodigoBarrasTipoPort {
    CodigoBarrasTipo adicionarCodigoBarrasTipo(AdicionarCodigoBarrasTipo adicionar);
}
