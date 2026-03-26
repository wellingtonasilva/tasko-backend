package br.com.wasistemas.tasko.pedido.adapter.out.persistence;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.mapper.PedidoEntityMapper;
import br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository.PedidoRepository;
import br.com.wasistemas.tasko.pedido.application.port.out.pedido.*;
import br.com.wasistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wasistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wasistemas.tasko.pedido.domain.pedido.Pedido;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PedidoPersistenceAdapter implements AdicionarPedidoPort, AtualizarPedidoPort,
        ExcluirPedidoPorIdPort, ListarPedidoPort, ObterPedidoPorIdPort {

    private final PedidoRepository repository;
    private final PedidoEntityMapper mapper;

    @Override
    public Pedido adicionarPedido(AdicionarPedido adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public Pedido atualizarPedido(Long id, AtualizarPedido atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirPedidoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Pedido> listarPedido(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public Pedido obterPedidoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
