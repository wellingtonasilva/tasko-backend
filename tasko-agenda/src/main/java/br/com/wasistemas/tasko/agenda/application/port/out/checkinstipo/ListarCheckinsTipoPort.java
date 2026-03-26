package br.com.wasistemas.tasko.agenda.application.port.out.checkinstipo;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import java.util.List;

public interface ListarCheckinsTipoPort {
    List<CheckinsTipo> listarCheckinsTipo(Paginacao paginacao);
}
