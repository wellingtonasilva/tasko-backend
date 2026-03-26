package br.com.wasistemas.tasko.produto.application.port.in.usecases;

import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import br.com.wasistemas.tasko.common.usecases.GenericUseCase;

public interface CodigoBarrasTipoUseCases extends GenericUseCase<CodigoBarrasTipo, AdicionarCodigoBarrasTipo, AtualizarCodigoBarrasTipo> {
}
