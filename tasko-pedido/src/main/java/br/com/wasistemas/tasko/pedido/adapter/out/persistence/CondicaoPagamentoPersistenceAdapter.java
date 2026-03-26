package br.com.wasistemas.tasko.pedido.adapter.out.persistence;

import br.com.wasistemas.tasko.pedido.adapter.out.persistence.mapper.CondicaoPagamentoEntityMapper;
import br.com.wasistemas.tasko.pedido.adapter.out.persistence.repository.CondicaoPagamentoRepository;
import br.com.wasistemas.tasko.pedido.application.port.out.condicaopagamento.*;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wasistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CondicaoPagamentoPersistenceAdapter implements AdicionarCondicaoPagamentoPort, AtualizarCondicaoPagamentoPort,
        ExcluirCondicaoPagamentoPorIdPort, ListarCondicaoPagamentoPort, ObterCondicaoPagamentoPorIdPort {

    private final CondicaoPagamentoRepository repository;
    private final CondicaoPagamentoEntityMapper mapper;

    @Override
    public CondicaoPagamento adicionarCondicaoPagamento(AdicionarCondicaoPagamento adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public CondicaoPagamento atualizarCondicaoPagamento(Long id, AtualizarCondicaoPagamento atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirCondicaoPagamentoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<CondicaoPagamento> listarCondicaoPagamento(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public CondicaoPagamento obterCondicaoPagamentoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
