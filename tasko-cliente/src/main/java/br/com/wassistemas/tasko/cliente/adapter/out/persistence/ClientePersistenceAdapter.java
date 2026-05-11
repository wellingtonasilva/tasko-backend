package br.com.wassistemas.tasko.cliente.adapter.out.persistence;

import br.com.wassistemas.tasko.cliente.adapter.out.persistence.entity.ClienteEntity;
import br.com.wassistemas.tasko.cliente.adapter.out.persistence.mapper.ClienteEntityMapper;
import br.com.wassistemas.tasko.cliente.adapter.out.persistence.repository.ClienteRepository;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.AdicionarClientePort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.AtualizarClientePort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.ExcluirClientePorIdPort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.ListarClientePort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.ObterClientePorIdPort;
import br.com.wassistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.AtualizarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClientePersistenceAdapter implements AdicionarClientePort, AtualizarClientePort,
    ExcluirClientePorIdPort, ListarClientePort, ObterClientePorIdPort {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteMapper;

    @Override
    public Cliente adicionarCliente(AdicionarCliente adicionarCliente) {
        return clienteMapper.toDomain(clienteRepository.save(clienteMapper.toEntity(adicionarCliente)));
    }

    @Override
    public Cliente atualizarCliente(Long id, AtualizarCliente atualizarCliente) {
        ClienteEntity entity = clienteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        clienteMapper.updateClienteEntity(atualizarCliente, entity);

        return clienteMapper.toDomain(clienteRepository.save(entity));
    }

    @Override
    public void excluirClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> listarCliente(Long empresaId, Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return clienteRepository.findByEmpresaId(empresaId, pageable).map(clienteMapper::toDomain).toList();
    }

    @Override
    public Cliente obterClientePorId(Long id) {
        return clienteMapper.toDomain(clienteRepository.findById(id).orElse(null));
    }
}

