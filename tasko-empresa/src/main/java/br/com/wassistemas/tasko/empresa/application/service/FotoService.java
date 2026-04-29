package br.com.wassistemas.tasko.empresa.application.service;

import br.com.wassistemas.tasko.empresa.application.port.in.usecases.FotoUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.AdicionarFotoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.AtualizarFotoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.ExcluirFotoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.ListarFotoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.ObterFotoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.foto.AdicionarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.Foto;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FotoService implements FotoUseCases {

    private final AdicionarFotoPort adicionarFotoPort;
    private final AtualizarFotoPort atualizarFotoPort;
    private final ExcluirFotoPorIdPort excluirFotoPorIdPort;
    private final ListarFotoPort listarFotoPort;
    private final ObterFotoPorIdPort obterFotoPorIdPort;

    @Override
    public Foto adicionar(Long empresaId, AdicionarFoto adicionar) {
        return adicionarFotoPort.adicionarFoto(adicionar);
    }

    @Override
    public List<Foto> listar(Long empresaId, Paginacao paginacao) {
        return listarFotoPort.listarFoto(paginacao);
    }

    @Override
    public Foto obterPorId(Long empresaId, Long id) {
        return obterFotoPorIdPort.obterFotoPorId(id);
    }

    @Override
    public Foto atualizar(Long empresaId, Long id, AtualizarFoto atualizar) {
        return atualizarFotoPort.atualizarFoto(id, atualizar);
    }

    @Override
    public void excluirPorId(Long empresaId, Long id) {
        excluirFotoPorIdPort.excluirFotoPorId(id);
    }
}
