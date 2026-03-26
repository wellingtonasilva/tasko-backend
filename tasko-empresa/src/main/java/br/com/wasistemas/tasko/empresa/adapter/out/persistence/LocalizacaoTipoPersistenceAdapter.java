package br.com.wasistemas.tasko.empresa.adapter.out.persistence;

import br.com.wasistemas.tasko.empresa.adapter.out.persistence.mapper.LocalizacaoTipoEntityMapper;
import br.com.wasistemas.tasko.empresa.adapter.out.persistence.repository.LocalizacaoTipoRepository;
import br.com.wasistemas.tasko.empresa.application.port.out.localizacaotipo.*;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.AdicionarLocalizacaoTipo;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.AtualizarLocalizacaoTipo;
import br.com.wasistemas.tasko.empresa.domain.localizacaotipo.LocalizacaoTipo;
import br.com.wasistemas.tasko.common.domain.Paginacao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LocalizacaoTipoPersistenceAdapter implements AdicionarLocalizacaoTipoPort, AtualizarLocalizacaoTipoPort,
        ExcluirLocalizacaoTipoPorIdPort, ListarLocalizacaoTipoPort, ObterLocalizacaoTipoPorIdPort {

    private final LocalizacaoTipoRepository repository;
    private final LocalizacaoTipoEntityMapper mapper;

    @Override
    public LocalizacaoTipo adicionarLocalizacaoTipo(AdicionarLocalizacaoTipo adicionar) {
        return mapper.toDomain(repository.save(mapper.toEntity(adicionar)));
    }

    @Override
    public LocalizacaoTipo atualizarLocalizacaoTipo(Long id, AtualizarLocalizacaoTipo atualizar) {
        return mapper.toDomain(repository.save(mapper.toEntity(id, atualizar)));
    }

    @Override
    public void excluirLocalizacaoTipoPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<LocalizacaoTipo> listarLocalizacaoTipo(Paginacao paginacao) {
        Sort.Direction direction = paginacao.getSortDirection().equalsIgnoreCase("desc")
                ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(paginacao.getPage(), paginacao.getSize(),
                Sort.by(direction, paginacao.getSortBy()));
        return repository.findAll(pageable).map(mapper::toDomain).toList();
    }

    @Override
    public LocalizacaoTipo obterLocalizacaoTipoPorId(Long id) {
        return mapper.toDomain(repository.findById(id).orElse(null));
    }
}
