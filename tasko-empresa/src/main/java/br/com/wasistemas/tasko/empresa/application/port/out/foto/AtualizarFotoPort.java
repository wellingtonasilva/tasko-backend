package br.com.wasistemas.tasko.empresa.application.port.out.foto;

import br.com.wasistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wasistemas.tasko.empresa.domain.foto.Foto;

public interface AtualizarFotoPort {
    Foto atualizarFoto(Long id, AtualizarFoto atualizar);
}
