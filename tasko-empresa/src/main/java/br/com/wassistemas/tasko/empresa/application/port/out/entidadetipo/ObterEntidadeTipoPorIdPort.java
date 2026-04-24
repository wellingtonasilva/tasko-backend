package br.com.wassistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;

public interface ObterEntidadeTipoPorIdPort {
    EntidadeTipo obterEntidadeTipoPorId(Long id);
}
