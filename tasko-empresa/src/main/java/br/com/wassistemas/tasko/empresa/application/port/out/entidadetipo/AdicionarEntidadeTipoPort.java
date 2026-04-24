package br.com.wassistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AdicionarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;

public interface AdicionarEntidadeTipoPort {
    EntidadeTipo adicionarEntidadeTipo(AdicionarEntidadeTipo adicionar);
}
