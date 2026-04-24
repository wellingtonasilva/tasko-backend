package br.com.wassistemas.tasko.empresa.application.port.out.empresa;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.empresa.Empresa;
import java.util.List;

public interface ListarEmpresaPort {
    List<Empresa> listarEmpresa(Paginacao paginacao);
}
