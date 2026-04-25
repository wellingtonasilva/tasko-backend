package br.com.wassistemas.tasko.common.usecases;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import java.util.List;

public interface GenericUseCase<T, S, U> {
    T adicionar(S adicionar) throws ResourceDuplicateException;
    List<T> listar(Paginacao paginacao);
    T obterPorId(Long id);
    T atualizar(Long id, U atualizar);
    void excluirPorId(Long id);
}
