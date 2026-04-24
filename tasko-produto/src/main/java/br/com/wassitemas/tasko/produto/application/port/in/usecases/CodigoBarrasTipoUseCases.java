package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import br.com.wassistemas.tasko.common.usecases.GenericUseCase;

public interface CodigoBarrasTipoUseCases extends GenericUseCase<CodigoBarrasTipo, AdicionarCodigoBarrasTipo, AtualizarCodigoBarrasTipo> {
}
