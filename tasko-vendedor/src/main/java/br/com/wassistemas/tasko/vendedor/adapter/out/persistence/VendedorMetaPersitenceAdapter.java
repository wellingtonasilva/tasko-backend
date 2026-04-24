package br.com.wassistemas.tasko.vendedor.adapter.out.persistence;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.mapper.VendedorEntityMapper;
import br.com.wassistemas.tasko.vendedor.adapter.out.persistence.repository.VendedorMetaRepository;
import br.com.wassistemas.tasko.vendedor.application.port.out.meta.AdicionarVendedorMetaPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.meta.AtualizarVendedorMetaPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.meta.ExcluirVendedorMetaPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.meta.ListarVendedorMetaPort;
import br.com.wassistemas.tasko.vendedor.application.port.out.meta.ObterVendedorMetaPort;
import br.com.wassistemas.tasko.vendedor.domain.meta.AdicionarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.AtualizarVendedorMeta;
import br.com.wassistemas.tasko.vendedor.domain.meta.VendedorMeta;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VendedorMetaPersitenceAdapter implements AdicionarVendedorMetaPort,
    AtualizarVendedorMetaPort,
    ExcluirVendedorMetaPort, ListarVendedorMetaPort, ObterVendedorMetaPort {

    private final VendedorMetaRepository vendedorMetaRepository;
    private final VendedorEntityMapper vendedorEntityMapper;
    @Override
    public VendedorMeta adicionarVendedorMeta(AdicionarVendedorMeta adicionarVendedorMeta) {
        return vendedorEntityMapper.toDomain(vendedorMetaRepository.save(vendedorEntityMapper.toEntity(adicionarVendedorMeta)));
    }

    @Override
    public VendedorMeta atualizarVendedorMeta(Long id, AtualizarVendedorMeta atualizarVendedorMeta) {
        return vendedorEntityMapper.toDomain(vendedorMetaRepository.save(vendedorEntityMapper.toEntity(id, atualizarVendedorMeta)));
    }

    @Override
    public void excluirVendedorMeta(Long id) {
        vendedorMetaRepository.deleteById(id);
    }

    @Override
    public List<VendedorMeta> listarVendedorMeta(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));

        return vendedorMetaRepository.findAll(pageable).map(vendedorEntityMapper::toDomain).toList();
    }

    @Override
    public VendedorMeta obterVendedorMeta(Long id) {
        return vendedorEntityMapper.toDomain(vendedorMetaRepository.findById(id).orElse(null));
    }
}
