package br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;

public interface ObterEmpresaLocalizacaoPorIdPort {
    EmpresaLocalizacao obterEmpresaLocalizacaoPorId(Long id);
}
