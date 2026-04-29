package br.com.wassistemas.tasko.vendedor.application.port.out.vendedor;

public interface ExcluirVendedorPorIdPort {
    void excluirById(Long empresaId, Long id);
}
