package br.com.wasistemas.tasko.cliente.adapter.out.persistence;

import br.com.wasistemas.tasko.cliente.adapter.out.persistence.mapper.ClienteEntityMapper;
import br.com.wasistemas.tasko.cliente.adapter.out.persistence.repository.ClienteTabelaPrecoRepository;
import br.com.wasistemas.tasko.cliente.application.port.out.tabelapreco.*;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wasistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClienteTabelaPrecoPersistenceAdapter implements AdicionarClienteTabelaPrecoPort,
        AtualizarClienteTabelaPrecoPort, ExcluirClienteTabelaPrecoPorIdPort,
        ListarClienteTabelaPrecoPort, ObterClienteTabelaPrecoPorIdPort {

    private final ClienteTabelaPrecoRepository repository;
    private final ClienteEntityMapper mapper;

    @Override
    public ClienteTabelaPreco adicionarClienteTabelaPreco(AdicionarClienteTabelaPreco adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public ClienteTabelaPreco atualizarClienteTabelaPreco(Long id, AtualizarClienteTabelaPreco atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirClienteTabelaPrecoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ClienteTabelaPreco> listarClienteTabelaPreco(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public ClienteTabelaPreco obterClienteTabelaPrecoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}

