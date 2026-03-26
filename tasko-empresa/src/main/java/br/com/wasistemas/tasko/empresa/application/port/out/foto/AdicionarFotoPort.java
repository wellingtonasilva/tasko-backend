package br.com.wasistemas.tasko.empresa.application.port.out.foto;

import br.com.wasistemas.tasko.empresa.domain.foto.AdicionarFoto;
import br.com.wasistemas.tasko.empresa.domain.foto.Foto;

public interface AdicionarFotoPort {
    Foto adicionarFoto(AdicionarFoto adicionar);
}
