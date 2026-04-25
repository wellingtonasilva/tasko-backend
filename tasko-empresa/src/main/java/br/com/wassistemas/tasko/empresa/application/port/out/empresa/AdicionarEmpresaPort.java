package br.com.wassistemas.tasko.empresa.application.port.out.empresa;

import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;

public interface AdicionarEmpresaPort {
    Empresa adicionarEmpresa(AdicionarEmpresa adicionar);
}
