package br.com.wassistemas.tasko.empresa.adapter.out.persistence.entity;

import br.com.wassistemas.tasko.common.entity.AuditoriaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empresa", schema = "crm")
@Data
@NoArgsConstructor
public class EmpresaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_nmempresa")
    private String nomeEmpresa;

    @Column(name = "emp_nncnpj")
    private String numeroCnpj;

    @Column(name = "emp_dsemail")
    private String email;

    @Column(name = "emp_dslogradouro")
    private String logradouro;

    @Column(name = "emp_nnporta")
    private String numero;

    @Column(name = "emp_nmbairro")
    private String nomeBairro;

    @Column(name = "emp_nmcidade")
    private String nomeCidade;

    @Column(name = "emp_cduf")
    private String uf;

    @Column(name = "emp_nmtelefone")
    private String numeroTelefone;

    @Embedded
    @AttributeOverride(name = "criadoEm", column = @Column(name = "emp_tmcriado_em"))
    @AttributeOverride(name = "atualizadoEm", column = @Column(name = "emp_tmatualizado_em"))
    @AttributeOverride(name = "indicadorAtivo", column = @Column(name = "emp_icativo"))
    private AuditoriaEntity auditoria;
}