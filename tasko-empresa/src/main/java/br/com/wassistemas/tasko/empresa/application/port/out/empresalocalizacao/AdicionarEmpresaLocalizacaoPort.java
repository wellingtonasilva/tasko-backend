package br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;

public interface AdicionarEmpresaLocalizacaoPort {
    EmpresaLocalizacao adicionarEmpresaLocalizacao(AdicionarEmpresaLocalizacao adicionar);
}
