package br.com.wasistemas.tasko.empresa.application.port.out.empresalocalizacao;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.empresa.domain.empresalocalizacao.EmpresaLocalizacao;
import java.util.List;

public interface ListarEmpresaLocalizacaoPort {
    List<EmpresaLocalizacao> listarEmpresaLocalizacao(Paginacao paginacao);
}
