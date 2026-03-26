package br.com.wasistemas.tasko.empresa.application.port.out.empresa;

import br.com.wasistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;

public interface AtualizarEmpresaPort {
    Empresa atualizarEmpresa(Long id, AtualizarEmpresa atualizar);
}
