package br.com.wasistemas.tasko.empresa.application.service;

import br.com.wasistemas.tasko.empresa.application.port.in.usecases.FotoUseCases;
import br.com.wasistemas.tasko.empresa.application.port.out.foto.*;
import br.com.wasistemas.tasko.empresa.domain.foto.AdicionarFoto;
import br.com.wasistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wasistemas.tasko.empresa.domain.foto.Foto;
import br.com.wasistemas.tasko.common.domain.Paginacao;
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
    public Foto adicionar(AdicionarFoto adicionar) {
        return adicionarFotoPort.adicionarFoto(adicionar);
    }

    @Override
    public List<Foto> listar(Paginacao paginacao) {
        return listarFotoPort.listarFoto(paginacao);
    }

    @Override
    public Foto obterPorId(Long id) {
        return obterFotoPorIdPort.obterFotoPorId(id);
    }

    @Override
    public Foto atualizar(Long id, AtualizarFoto atualizar) {
        return atualizarFotoPort.atualizarFoto(id, atualizar);
    }

    @Override
    public void excluirPorId(Long id) {
        excluirFotoPorIdPort.excluirFotoPorId(id);
    }
}
