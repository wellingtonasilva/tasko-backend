package br.com.wassistemas.tasko.pedido.adapter.out.persistence;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper.FormaPagamentoEntityMapper;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository.FormaPagamentoRepository;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.AdicionarFormaPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.AtualizarFormaPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.ExcluirFormaPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.ListarFormaPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.formapagamento.ObterFormaPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AdicionarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.AtualizarFormaPagamento;
import br.com.wassistemas.tasko.pedido.domain.formapagamento.FormaPagamento;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FormaPagamentoPersistenceAdapter implements AdicionarFormaPagamentoPort,
    AtualizarFormaPagamentoPort,
    ExcluirFormaPagamentoPorIdPort, ListarFormaPagamentoPort, ObterFormaPagamentoPorIdPort {

    private final FormaPagamentoRepository repository;
    private final FormaPagamentoEntityMapper mapper;

    @Override
    public FormaPagamento adicionarFormaPagamento(AdicionarFormaPagamento adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public FormaPagamento atualizarFormaPagamento(Long id, AtualizarFormaPagamento atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirFormaPagamentoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<FormaPagamento> listarFormaPagamento(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findByEmpresaId(empresaId, pageable).map(mapper::toDomain).toList();
    }

    @Override
    public FormaPagamento obterFormaPagamentoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
