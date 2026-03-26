package br.com.wasistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import java.util.List;

public interface ListarEntidadeTipoPort {
    List<EntidadeTipo> listarEntidadeTipo(Paginacao paginacao);
}
