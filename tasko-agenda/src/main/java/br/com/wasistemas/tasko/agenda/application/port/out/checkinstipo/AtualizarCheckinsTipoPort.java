package br.com.wasistemas.tasko.agenda.application.port.out.checkinstipo;

import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AtualizarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;

public interface AtualizarCheckinsTipoPort {
    CheckinsTipo atualizarCheckinsTipo(Long id, AtualizarCheckinsTipo atualizar);
}
