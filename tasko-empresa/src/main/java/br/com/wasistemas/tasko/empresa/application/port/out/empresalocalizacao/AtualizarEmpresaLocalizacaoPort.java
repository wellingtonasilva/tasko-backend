package br.com.wasistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.AtualizarEmpresaLocalizacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;

public interface AtualizarEmpresaLocalizacaoPort {
    EmpresaLocalizacao atualizarEmpresaLocalizacao(Long id, AtualizarEmpresaLocalizacao atualizar);
}
