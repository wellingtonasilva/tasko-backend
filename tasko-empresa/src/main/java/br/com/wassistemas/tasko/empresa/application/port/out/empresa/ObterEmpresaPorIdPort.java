package br.com.wassistemas.tasko.empresa.application.port.out.empresa;

import br.com.wassistemas.tasko.common.domain.empresa.Empresa;

public interface ObterEmpresaPorIdPort {
    Empresa obterEmpresaPorId(Long id);
}
