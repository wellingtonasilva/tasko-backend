package br.com.wassistemas.tasko.common.usecases;

import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import java.util.List;

public interface TenantUseCase<T, S, U> {

  T adicionar(Long empresaId, S adicionar) throws ResourceDuplicateException;

  List<T> listar(Long empresaId, Paginacao paginacao);

  T obterPorId(Long empresaId, Long id);

  T atualizar(Long empresaId, Long id, U atualizar);

  void excluirPorId(Long empresaId, Long id);
}