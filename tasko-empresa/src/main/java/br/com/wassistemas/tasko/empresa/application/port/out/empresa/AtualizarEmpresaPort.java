package br.com.wassistemas.tasko.empresa.application.port.out.empresa;

import br.com.wassistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;

public interface AtualizarEmpresaPort {
    Empresa atualizarEmpresa(Long id, AtualizarEmpresa atualizar);
}
