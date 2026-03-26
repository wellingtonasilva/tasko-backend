package br.com.wasistemas.tasko.empresa.domain.localizacaotipo;

import br.com.wasistemas.tasko.common.domain.Auditoria;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LocalizacaoTipo {
    private Long id;
    private String descricaoLocalizacaoTipo;
    private Auditoria auditoria;
}
