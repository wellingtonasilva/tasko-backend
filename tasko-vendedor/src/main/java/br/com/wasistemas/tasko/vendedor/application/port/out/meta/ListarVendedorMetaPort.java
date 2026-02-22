package br.com.wasistemas.tasko.vendedor.application.port.out.meta;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;

import java.util.List;

public interface ListarVendedorMetaPort {
    List<VendedorMeta> listarVendedorMeta(Paginacao paginacao);
}
