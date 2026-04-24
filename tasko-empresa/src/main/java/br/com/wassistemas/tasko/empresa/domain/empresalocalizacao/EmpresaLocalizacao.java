package br.com.wassistemas.tasko.empresa.domain.empresalocalizacao;

import br.com.wassistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class EmpresaLocalizacao {
    private Long id;
    private Long empresaId;
    private String nomeLocalizacao;
    private Long localizacaoTipoId;
    private Auditoria auditoria;
}
