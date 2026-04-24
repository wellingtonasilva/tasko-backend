package br.com.wassistemas.tasko.empresa.domain.empresalocalizacao;

import lombok.Value;


@Value
public class AdicionarEmpresaLocalizacao {
    Long empresaId;
    String nomeLocalizacao;
    Long localizacaoTipoId;
}
