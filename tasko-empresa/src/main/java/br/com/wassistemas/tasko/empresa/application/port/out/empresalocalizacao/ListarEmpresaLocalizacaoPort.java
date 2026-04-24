package br.com.wassistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import java.util.List;

public interface ListarEmpresaLocalizacaoPort {
    List<EmpresaLocalizacao> listarEmpresaLocalizacao(Paginacao paginacao);
}
