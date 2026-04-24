package br.com.wassistemas.tasko.empresa.application.port.out.foto;

import br.com.wassistemas.tasko.empresa.domain.foto.Foto;

public interface ObterFotoPorIdPort {
    Foto obterFotoPorId(Long id);
}
