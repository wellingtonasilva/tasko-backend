package br.com.wassistemas.tasko.agenda.application.port.out.checkinstipo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;
import java.util.List;

public interface ListarCheckinsTipoPort {
    List<CheckinsTipo> listarCheckinsTipo(Paginacao paginacao);
}
