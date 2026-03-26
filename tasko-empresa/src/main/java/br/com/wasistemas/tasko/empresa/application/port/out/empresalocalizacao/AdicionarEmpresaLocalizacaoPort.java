package br.com.wasistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.AdicionarEmpresaLocalizacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;

public interface AdicionarEmpresaLocalizacaoPort {
    EmpresaLocalizacao adicionarEmpresaLocalizacao(AdicionarEmpresaLocalizacao adicionar);
}
