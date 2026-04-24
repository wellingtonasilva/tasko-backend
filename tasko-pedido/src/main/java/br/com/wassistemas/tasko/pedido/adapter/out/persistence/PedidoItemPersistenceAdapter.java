package br.com.wassistemas.tasko.pedido.adapter.out.persistence;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper.PedidoItemEntityMapper;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository.PedidoItemRepository;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem.AdicionarPedidoItemPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem.AtualizarPedidoItemPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem.ExcluirPedidoItemPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem.ListarPedidoItemPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedidoitem.ObterPedidoItemPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AdicionarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.AtualizarPedidoItem;
import br.com.wassistemas.tasko.pedido.domain.pedidoitem.PedidoItem;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PedidoItemPersistenceAdapter implements AdicionarPedidoItemPort,
    AtualizarPedidoItemPort,
    ExcluirPedidoItemPorIdPort, ListarPedidoItemPort, ObterPedidoItemPorIdPort {

    private final PedidoItemRepository repository;
    private final PedidoItemEntityMapper mapper;

    @Override
    public PedidoItem adicionarPedidoItem(AdicionarPedidoItem adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public PedidoItem atualizarPedidoItem(Long id, AtualizarPedidoItem atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirPedidoItemPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<PedidoItem> listarPedidoItem(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public PedidoItem obterPedidoItemPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
