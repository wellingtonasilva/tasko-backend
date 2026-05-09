package br.com.wassistemas.tasko.pedido.adapter.out.persistence;

import br.com.wassistemas.tasko.pedido.adapter.out.persistence.entity.CondicaoPagamentoEntity;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.mapper.CondicaoPagamentoEntityMapper;
import br.com.wassistemas.tasko.pedido.adapter.out.persistence.repository.CondicaoPagamentoRepository;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.AdicionarCondicaoPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.AtualizarCondicaoPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.ExcluirCondicaoPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.ListarCondicaoPagamentoPort;
import br.com.wassistemas.tasko.pedido.application.port.out.condicaopagamento.ObterCondicaoPagamentoPorIdPort;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AdicionarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.AtualizarCondicaoPagamento;
import br.com.wassistemas.tasko.pedido.domain.condicaopagamento.CondicaoPagamento;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CondicaoPagamentoPersistenceAdapter implements AdicionarCondicaoPagamentoPort,
    AtualizarCondicaoPagamentoPort,
    ExcluirCondicaoPagamentoPorIdPort, ListarCondicaoPagamentoPort,
    ObterCondicaoPagamentoPorIdPort {

    private final CondicaoPagamentoRepository repository;
    private final CondicaoPagamentoEntityMapper mapper;

    @Override
    public CondicaoPagamento adicionarCondicaoPagamento(AdicionarCondicaoPagamento adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public CondicaoPagamento atualizarCondicaoPagamento(Long id, AtualizarCondicaoPagamento atualizar) {
        CondicaoPagamentoEntity entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Condição de Pagamento não encontrado"));
        mapper.updateCondicaoPagamentoEntity(atualizar, entity);

        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public void excluirCondicaoPagamentoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<CondicaoPagamento> listarCondicaoPagamento(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findByEmpresaId(empresaId, pageable).map(mapper::toDomain).toList();
    }

    @Override
    public CondicaoPagamento obterCondicaoPagamentoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
