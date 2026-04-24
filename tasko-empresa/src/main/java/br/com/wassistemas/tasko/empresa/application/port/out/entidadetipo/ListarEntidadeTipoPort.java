package br.com.wassistemas.tasko.empresa.application.port.out.entidadetipo;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.entidadetipo.EntidadeTipo;
import java.util.List;

public interface ListarEntidadeTipoPort {
    List<EntidadeTipo> listarEntidadeTipo(Paginacao paginacao);
}
