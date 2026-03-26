package br.com.wasistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wasistemas.tasko.empresa.domain.entidadetipo.AtualizarEntidadeTipo;
import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;

public interface AtualizarEntidadeTipoPort {
    EntidadeTipo atualizarEntidadeTipo(Long id, AtualizarEntidadeTipo atualizar);
}
