package br.com.wasistemas.tasko.empresa.application.port.out.empresa;

import br.com.wasistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;

public interface AdicionarEmpresaPort {
    Empresa adicionarEmpresa(AdicionarEmpresa adicionar);
}
