package br.com.wassistemas.tasko.agenda.application.port.out.checkinstipo;

import br.com.wassistemas.tasko.agenda.domain.checkinstipo.CheckinsTipo;

public interface ObterCheckinsTipoPorIdPort {
    CheckinsTipo obterCheckinsTipoPorId(Long id);
}
