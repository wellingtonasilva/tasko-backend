package br.com.wassistemas.tasko.empresa.application.port.out.foto;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.foto.Foto;
import java.util.List;

public interface ListarFotoPort {
    List<Foto> listarFoto(Paginacao paginacao);
}
