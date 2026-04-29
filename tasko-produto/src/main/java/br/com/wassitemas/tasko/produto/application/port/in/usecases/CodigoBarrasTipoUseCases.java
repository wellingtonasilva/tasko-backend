package br.com.wassitemas.tasko.produto.application.port.in.usecases;

import br.com.wassistemas.tasko.common.usecases.BaseUseCase;
import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wassitemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;

public interface CodigoBarrasTipoUseCases extends
    BaseUseCase<CodigoBarrasTipo, AdicionarCodigoBarrasTipo, AtualizarCodigoBarrasTipo> {
}
