package br.com.wasistemas.tasko.agenda.application.port.out.checkinstipo;

import br.com.wasistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wasistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;

public interface AdicionarCheckinsTipoPort {
    CheckinsTipo adicionarCheckinsTipo(AdicionarCheckinsTipo adicionar);
}
