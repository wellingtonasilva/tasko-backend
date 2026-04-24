package br.com.wassistemas.tasko.empresa.application.port.out.foto;

import br.com.wassistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.Foto;

public interface AtualizarFotoPort {
    Foto atualizarFoto(Long id, AtualizarFoto atualizar);
}
