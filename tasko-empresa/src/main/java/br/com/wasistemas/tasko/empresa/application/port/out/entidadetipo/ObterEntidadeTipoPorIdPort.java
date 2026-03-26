package br.com.wasistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wasistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;

public interface ObterEntidadeTipoPorIdPort {
    EntidadeTipo obterEntidadeTipoPorId(Long id);
}
