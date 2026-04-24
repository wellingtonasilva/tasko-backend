package br.com.wassistemas.tasko.empresa.adapter.out.persistence;

import br.com.wassistemas.tasko.empresa.adapter.out.persistence.mapper.FotoEntityMapper;
import br.com.wassistemas.tasko.empresa.adapter.out.persistence.repository.FotoRepository;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.AdicionarFotoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.AtualizarFotoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.ExcluirFotoPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.ListarFotoPort;
import br.com.wassistemas.tasko.empresa.application.port.out.foto.ObterFotoPorIdPort;
import br.com.wassistemas.tasko.empresa.domain.foto.AdicionarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.AtualizarFoto;
import br.com.wassistemas.tasko.empresa.domain.foto.Foto;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FotoPersistenceAdapter implements AdicionarFotoPort, AtualizarFotoPort,
    ExcluirFotoPorIdPort, ListarFotoPort, ObterFotoPorIdPort {

    private final FotoRepository repository;
    private final FotoEntityMapper mapper;

    @Override
    public Foto adicionarFoto(AdicionarFoto adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public Foto atualizarFoto(Long id, AtualizarFoto atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirFotoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Foto> listarFoto(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public Foto obterFotoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
