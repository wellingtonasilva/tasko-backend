package br.com.wassistemas.tasko.empresa.domain.empresalocalizacao;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Value
@Builder
@Getter
public class AtualizarEmpresaLocalizacao {
    Long id;
    Long empresaId;
    String nomeLocalizacao;
    Long localizacaoTipoId;
}
