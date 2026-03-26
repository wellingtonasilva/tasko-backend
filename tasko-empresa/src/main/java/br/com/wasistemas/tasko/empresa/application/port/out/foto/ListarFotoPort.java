package br.com.wasistemas.tasko.empresa.application.port.out.foto;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.foto.Foto;
import java.util.List;

public interface ListarFotoPort {
    List<Foto> listarFoto(Paginacao paginacao);
}
