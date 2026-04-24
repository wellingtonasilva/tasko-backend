package br.com.wassistemas.tasko.vendedor.application.port.out.meta;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;

import java.util.List;

public interface ListarVendedorMetaPort {
    List<VendedorMeta> listarVendedorMeta(Paginacao paginacao);
}
