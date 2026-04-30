package br.com.wassistemas.tasko.produto.application.service;

import br.com.wassistemas.tasko.produto.application.port.in.usecases.CodigoBarrasTipoUseCases;
import br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo.AdicionarCodigoBarrasTipoPort;
import br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo.AtualizarCodigoBarrasTipoPort;
import br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo.ExcluirCodigoBarrasTipoPorIdPort;
import br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo.ListarCodigoBarrasTipoPort;
import br.com.wassistemas.tasko.produto.application.port.out.codigobarrastipo.ObterCodigoBarrasTipoPorIdPort;
import br.com.wassistemas.tasko.produto.domain.codigobarrastipo.AdicionarCodigoBarrasTipo;
import br.com.wassistemas.tasko.produto.domain.codigobarrastipo.AtualizarCodigoBarrasTipo;
import br.com.wassistemas.tasko.produto.domain.codigobarrastipo.CodigoBarrasTipo;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CodigoBarrasTipoService implements CodigoBarrasTipoUseCases {

    private final AdicionarCodigoBarrasTipoPort adicionarCodigoBarrasTipoPort;
    private final AtualizarCodigoBarrasTipoPort atualizarCodigoBarrasTipoPort;
    private final ExcluirCodigoBarrasTipoPorIdPort excluirCodigoBarrasTipoPorIdPort;
    private final ListarCodigoBarrasTipoPort listarCodigoBarrasTipoPort;
    private final ObterCodigoBarrasTipoPorIdPort obterCodigoBarrasTipoPorIdPort;

    @Override
    public CodigoBarrasTipo adicionar(AdicionarCodigoBarrasTipo adicionar) {
        return adicionarCodigoBarrasTipoPort.adicionarCodigoBarrasTipo(adicionar);
    }

    @Override
    public List<CodigoBarrasTipo> listar(Paginacao paginacao) {
        return listarCodigoBarrasTipoPort.listarCodigoBarrasTipo(paginacao);
    }

    @Override
    public CodigoBarrasTipo obterPorId(Long id) {
        return obterCodigoBarrasTipoPorIdPort.obterCodigoBarrasTipoPorId(id);
    }

    @Override
    public CodigoBarrasTipo atualizar(Long id, AtualizarCodigoBarrasTipo atualizar) {
        return atualizarCodigoBarrasTipoPort.atualizarCodigoBarrasTipo(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirCodigoBarrasTipoPorIdPort.excluirCodigoBarrasTipoPorId(id);
    }
}
