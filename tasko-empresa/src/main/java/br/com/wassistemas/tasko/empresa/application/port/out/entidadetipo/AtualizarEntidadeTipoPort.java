package br.com.wassistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wassistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;

public interface AtualizarEntidadeTipoPort {
    EntidadeTipo atualizarEntidadeTipo(Long id, AtualizarEntidadeTipo atualizar);
}
