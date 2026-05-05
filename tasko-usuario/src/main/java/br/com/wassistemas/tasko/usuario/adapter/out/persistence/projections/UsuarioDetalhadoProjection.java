package br.com.wassistemas.tasko.usuario.adapter.out.persistence.projections;

import java.time.LocalDateTime;

public interface UsuarioDetalhadoProjection {

  Long getId();

  String getNomeUsuario();

  LocalDateTime getCriadoEm();

  LocalDateTime getAtualizadoEm();

  Boolean getIndicadorAtivo();

  Long getVendedorId();

  String getVendedorCodigo();

  String getVendedorNome();

  String getVendedorCpf();

  String getVendedorEmail();

  String getVendedorTelefone();

  String getNomeCompleto();

  String getNumeroTelefone();
}

