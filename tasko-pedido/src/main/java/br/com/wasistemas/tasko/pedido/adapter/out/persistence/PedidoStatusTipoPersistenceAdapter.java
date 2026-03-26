package br.com.wasistemas.tasko.pedido.adapter.out.persistence;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.mapper.PedidoStatusTipoEntityMapper;
import br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository.PedidoStatusTipoRepository;
import br.com.wasistemas.tasko.pedido.application.port.out.pedidostatustipo.*;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AdicionarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.AtualizarPedidoStatusTipo;
import br.com.wasistemas.tasko.pedido.domain.pedidostatustipo.PedidoStatusTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PedidoStatusTipoPersistenceAdapter implements AdicionarPedidoStatusTipoPort, AtualizarPedidoStatusTipoPort,
        ExcluirPedidoStatusTipoPorIdPort, ListarPedidoStatusTipoPort, ObterPedidoStatusTipoPorIdPort {

    private final PedidoStatusTipoRepository repository;
    private final PedidoStatusTipoEntityMapper mapper;

    @Override
    public PedidoStatusTipo adicionarPedidoStatusTipo(AdicionarPedidoStatusTipo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public PedidoStatusTipo atualizarPedidoStatusTipo(Long id, AtualizarPedidoStatusTipo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirPedidoStatusTipoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<PedidoStatusTipo> listarPedidoStatusTipo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public PedidoStatusTipo obterPedidoStatusTipoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
