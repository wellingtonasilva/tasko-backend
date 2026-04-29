package br.com.wassistemas.tasko.cliente.application.service;

import br.com.wassistemas.tasko.cliente.application.port.in.usecases.ClienteUseCases;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.AdicionarClientePort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.AtualizarClientePort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.ExcluirClientePorIdPort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.ListarClientePort;
import br.com.wassistemas.tasko.cliente.application.port.out.cliente.ObterClientePorIdPort;
import br.com.wassistemas.tasko.cliente.domain.cliente.AdicionarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.AtualizarCliente;
import br.com.wassistemas.tasko.cliente.domain.cliente.Cliente;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ClienteService implements ClienteUseCases {

    private final AdicionarClientePort adicionarClientePort;
    private final AtualizarClientePort atualizarClientePort;
    private final ExcluirClientePorIdPort excluirClientePorIdPort;
    private final ListarClientePort listarClientePort;
    private final ObterClientePorIdPort obterClientePorIdPort;

    @Override
    public Cliente adicionar(Long empresaId, AdicionarCliente adicionar) {
        return adicionarClientePort.adicionarCliente(adicionar);
    }

    @Override
    public List<Cliente> listar(Long empresaId, Paginacao paginacao) {
        return listarClientePort.listarCliente(paginacao);
    }

    @Override
    public Cliente obterPorId(Long empresaId, Long id) {
        return obterClientePorIdPort.obterClientePorId(id);
    }

    @Override
    public Cliente atualizar(Long empresaId, Long id, AtualizarCliente atualizar) {
        return atualizarClientePort.atualizarCliente(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirClientePorIdPort.excluirClientePorId(id);
    }
}

