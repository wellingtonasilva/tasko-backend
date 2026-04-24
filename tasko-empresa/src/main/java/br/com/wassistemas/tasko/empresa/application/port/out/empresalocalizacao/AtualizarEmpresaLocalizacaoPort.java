package br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;

public interface AtualizarEmpresaLocalizacaoPort {
    EmpresaLocalizacao atualizarEmpresaLocalizacao(Long id, AtualizarEmpresaLocalizacao atualizar);
}
