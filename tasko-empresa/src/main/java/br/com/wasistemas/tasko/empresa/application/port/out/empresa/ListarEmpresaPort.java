package br.com.wasistemas.tasko.empresa.application.port.out.empresa;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;
import java.util.List;

public interface ListarEmpresaPort {
    List<Empresa> listarEmpresa(Paginacao paginacao);
}
