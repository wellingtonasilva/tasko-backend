package br.com.wasistemas.tasko.produto.application.port.out.codigobarrastipo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import java.util.List;

public interface ListarCodigoBarrasTipoPort {
    List<CodigoBarrasTipo> listarCodigoBarrasTipo(Paginacao paginacao);
}
