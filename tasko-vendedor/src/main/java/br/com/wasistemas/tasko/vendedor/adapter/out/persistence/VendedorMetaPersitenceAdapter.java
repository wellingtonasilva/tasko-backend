package br.com.wasistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.application.port.out.meta.*;
import br.com.wasistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorMetaPersitenceAdapter implements AdicionarVendedorMetaPort, AtualizarVendedorMetaPort,
        ExcluirVendedorMetaPort, ListarVendedorMetaPort, ObterVendedorMetaPort {
    @Override
    public VendedorMeta adicionarVendedorMeta(AdicionarVendedorMeta adicionarVendedorMeta) {
        return null;
    }

    @Override
    public VendedorMeta atualizarVendedorMeta(AtualizarVendedorMeta atualizarVendedorMeta) {
        return null;
    }

    @Override
    public void excluirVendedorMeta(Long id) {

    }

    @Override
    public List<VendedorMeta> listarVendedorMeta(Paginacao paginacao) {
        return List.of();
    }

    @Override
    public VendedorMeta obterVendedorMeta(Long id) {
        return null;
    }
}
