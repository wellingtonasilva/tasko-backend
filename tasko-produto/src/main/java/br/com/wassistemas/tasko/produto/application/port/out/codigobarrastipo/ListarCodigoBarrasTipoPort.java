package br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import java.util.List;

public interface ListarCodigoBarrasTipoPort {
    List<CodigoBarrasTipo> listarCodigoBarrasTipo(Paginacao paginacao);
}
