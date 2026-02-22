package br.com.wasistemas.tasko.vendedor.application.service;

import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.vendedor.application.port.in.usecases.VendedorMetaUseCase;
import br.com.wasistemas.tasko.vendedor.application.port.out.meta.*;
import br.com.wasistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wasistemas.tasko.vendedor.domain.meta.VendedorMeta;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VendedorMetaService implements VendedorMetaUseCase {
    private final AdicionarVendedorMetaPort adicionarVendedorMetaPort;
    private final AtualizarVendedorMetaPort atualizarVendedorMetaPort;
    private final ExcluirVendedorMetaPort excluirVendedorMetaPort;
    private final ListarVendedorMetaPort listarVendedorMetaPort;
    private final ObterVendedorMetaPort obterVendedorMetaPort;

    @Override
    public VendedorMeta adicionar(AdicionarVendedorMeta adicionar) {
        return adicionarVendedorMetaPort.adicionarVendedorMeta(adicionar);
    }

    @Override
    public List<VendedorMeta> listar(Paginacao paginacao) {
        return listarVendedorMetaPort.listarVendedorMeta(paginacao);
    }

    @Override
    public VendedorMeta obterPorId(Long id) {
        return obterVendedorMetaPort.obterVendedorMeta(id);
    }

    @Override
    public VendedorMeta atualizar(Long id, AtualizarVendedorMeta atualizar) {
        return atualizarVendedorMetaPort.atualizarVendedorMeta(atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirVendedorMetaPort.excluirVendedorMeta(id);
    }
}
