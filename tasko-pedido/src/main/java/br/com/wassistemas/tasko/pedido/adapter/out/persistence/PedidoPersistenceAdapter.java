package br.com.wassistemas.tasko.pedido.adapter.out.persistence;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper.PedidoEntityMapper;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository.PedidoRepository;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.AdicionarPedidoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.AtualizarPedidoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.ExcluirPedidoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.ListarPedidoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.pedido.ObterPedidoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.pedido.AdicionarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.AtualizarPedido;
import br.com.wassistemas.tasko.pedido.domain.pedido.Pedido;
import br.com.wassistemas.tasko.common.domain.Paginacao;
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
    public List<Pedido> listarPedido(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findByEmpresaId(empresaId, pageable).map(mapper::toDomain).toList();
    }

    @Override
    public Pedido obterPedidoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
