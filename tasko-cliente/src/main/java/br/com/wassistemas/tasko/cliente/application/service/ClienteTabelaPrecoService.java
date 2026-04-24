package br.com.wassistemas.tasko.cliente.application.service;

import br.com.wassistemas.tasko.cliente.application.port.in.usecases.ClienteTabelaPrecoUseCases;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco.AdicionarClienteTabelaPrecoPort;
import br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco.AtualizarClienteTabelaPrecoPort;
import br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco.ExcluirClienteTabelaPrecoPorIdPort;
import br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco.ListarClienteTabelaPrecoPort;
import br.com.wassistemas.tasko.cliente.application.port.out.tabelapreco.ObterClienteTabelaPrecoPorIdPort;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AdicionarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.AtualizarClienteTabelaPreco;
import br.com.wassistemas.tasko.cliente.domain.tabelapreco.ClienteTabelaPreco;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ClienteTabelaPrecoService implements ClienteTabelaPrecoUseCases {

    private final AdicionarClienteTabelaPrecoPort adicionarPort;
    private final AtualizarClienteTabelaPrecoPort atualizarPort;
    private final ExcluirClienteTabelaPrecoPorIdPort excluirPort;
    private final ListarClienteTabelaPrecoPort listarPort;
    private final ObterClienteTabelaPrecoPorIdPort obterPort;

    @Override
    public ClienteTabelaPreco adicionar(AdicionarClienteTabelaPreco adicionar) {
        return adicionarPort.adicionarClienteTabelaPreco(adicionar);
    }

    @Override
    public List<ClienteTabelaPreco> listar(Paginacao paginacao) {
        return listarPort.listarClienteTabelaPreco(paginacao);
    }

    @Override
    public ClienteTabelaPreco obterPorId(Long id) {
        return obterPort.obterClienteTabelaPrecoPorId(id);
    }

    @Override
    public ClienteTabelaPreco atualizar(Long id, AtualizarClienteTabelaPreco atualizar) {
        return atualizarPort.atualizarClienteTabelaPreco(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirPort.excluirClienteTabelaPrecoPorId(id);
    }
}

