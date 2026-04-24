package br.com.wassistemas.tasko.agenda.application.port.out.checkinstipo;

import br.com.wassistemas.tasko.agenda.domain.checkinstipo.AdicionarCheckinsTipo;
import br.com.wassistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;

public interface AdicionarCheckinsTipoPort {
    CheckinsTipo adicionarCheckinsTipo(AdicionarCheckinsTipo adicionar);
}
