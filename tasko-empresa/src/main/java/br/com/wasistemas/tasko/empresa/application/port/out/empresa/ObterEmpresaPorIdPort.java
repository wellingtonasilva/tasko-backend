package br.com.wasistemas.tasko.empresa.application.port.out.empresa;

import br.com.wasistemas.tasko.empresa.domain.empresa.Empresa;

public interface ObterEmpresaPorIdPort {
    Empresa obterEmpresaPorId(Long id);
}
