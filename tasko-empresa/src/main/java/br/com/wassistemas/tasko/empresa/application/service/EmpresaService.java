package br.com.wassistemas.tasko.empresa.application.service;

import br.com.wassistemas.tasko.common.exception.ResourceDuplicateException;
import br.com.wassistemas.tasko.empresa.application.port.in.usecases.EmpresaUseCases;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.AdicionarEmpresaPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.AtualizarEmpresaPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ExcluirEmpresaPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ExisteEmpresaComDominioPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ExisteEmpresaComEmailPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ListarEmpresaPort;
import br.com.wassistemas.tasko.empresa.application.port.out.empresa.ObterEmpresaPorIdPort;
import br.com.wassistemas.tasko.empresa.application.port.out.usuario.EmpresaUsuarioServicePort;
import br.com.wassistemas.tasko.empresa.domain.empresa.AdicionarEmpresa;
import br.com.wassistemas.tasko.empresa.domain.empresa.AtualizarEmpresa;
import br.com.wassistemas.tasko.common.domain.empresa.Empresa;
import br.com.wassistemas.tasko.common.domain.Paginacao;
import br.com.wassistemas.tasko.empresa.domain.empresa.CriarEmpresa;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmpresaService implements EmpresaUseCases {

  private final AdicionarEmpresaPort adicionarEmpresaPort;
  private final AtualizarEmpresaPort atualizarEmpresaPort;
  private final ExcluirEmpresaPorIdPort excluirEmpresaPorIdPort;
  private final ListarEmpresaPort listarEmpresaPort;
  private final ObterEmpresaPorIdPort obterEmpresaPorIdPort;
  private final EmpresaUsuarioServicePort empresaUsuarioServicePort;
  private final ExisteEmpresaComDominioPort existeEmpresaComDominioPort;
  private final ExisteEmpresaComEmailPort existeEmpresaComEmailPort;

  @Override
  public Empresa adicionar(AdicionarEmpresa adicionar) throws ResourceDuplicateException {
    if (existeEmpresaComDominioPort.existeEmpresaComDominio(adicionar.getDominio()) > 0) {
      throw new ResourceDuplicateException("Sigla ou domínio já existe para outra empresa.");
    }
    Empresa empresa = adicionarEmpresaPort.adicionarEmpresa(adicionar);
    empresaUsuarioServicePort.criarUsuarioParaEmpresa(empresa.getId(), CriarEmpresa.builder()
        .nomeEmpresa(empresa.getNomeEmpresa())
        .email(empresa.getEmail())
        .build());

    return empresa;
  }

  @Override
  public List<Empresa> listar(Paginacao paginacao) {
    return listarEmpresaPort.listarEmpresa(paginacao);
  }

  @Override
  public Empresa obterPorId(Long id) {
    return obterEmpresaPorIdPort.obterEmpresaPorId(id);
  }

  @Override
  public Empresa atualizar(Long id, AtualizarEmpresa atualizar) {
    return atualizarEmpresaPort.atualizarEmpresa(id, atualizar);
  }

  @Override
  public void excluirPorId(Long id) {
    excluirEmpresaPorIdPort.excluirEmpresaPorId(id);
  }

  @Override
  public Empresa criarEmpresa(CriarEmpresa criarEmpresa) throws ResourceDuplicateException {
    if (existeEmpresaComEmailPort.existeEmpresaComEmail(criarEmpresa.getEmail()) > 0) {
      throw new ResourceDuplicateException("Email já existe para outra empresa.");
    }

    Empresa empresa = adicionarEmpresaPort.adicionarEmpresa(AdicionarEmpresa.builder()
        .nomeEmpresa(criarEmpresa.getNomeEmpresa())
        .email(criarEmpresa.getEmail())
        .build());
    empresaUsuarioServicePort.criarUsuarioParaEmpresa(empresa.getId(),
        CriarEmpresa.builder()
            .nomeEmpresa(empresa.getNomeEmpresa())
            .email(empresa.getEmail())
            .senha(criarEmpresa.getSenha())
            .build());

    return empresa;
  }
}
