package br.com.wassistemas.tasko.usuario.adapter.out.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendedor", schema = "crm")
@Data
@NoArgsConstructor
public class VendedorRefEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "vend_id")
  private Long id;

  @Column(name = "vend_cdvendedor")
  private String codigoVendedor;

  @Column(name = "vend_nmvendedor")
  private String nomeVendedor;

  @Column(name = "vend_nncpf")
  private String numeroCPF;

  @Column(name = "vend_dsemail")
  private String email;

  @Column(name = "vend_nntelefone")
  private String numeroTelefone;
}

