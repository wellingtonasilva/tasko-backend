package br.com.wassistemas.tasko.cliente.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicionar um Cliente")
public class AdicionarClienteRequest {
    @Schema(description = "Id. do Vendedor Responsável", example = "1")
    Long vendedorId;

    @Schema(description = "Código do Cliente", example = "CLI-001")
    String codigoCliente;

    @Schema(description = "Razão Social", example = "Empresa XYZ Ltda")
    String razaoSocial;

    @Schema(description = "Nome Fantasia", example = "XYZ Materiais")
    String nomeFantasia;

    @Schema(description = "CNPJ ou CPF", example = "12.345.678/0001-99")
    String cnpjCpf;

    @Schema(description = "Inscrição Estadual", example = "123456789")
    String inscricaoEstadual;

    @Schema(description = "Tipo do Cliente (PF/PJ)", example = "PJ")
    String tipo;

    @Schema(description = "Segmento", example = "Varejo")
    String segmento;

    @Schema(description = "Categoria (A/B/C/D)", example = "A")
    String categoria;

    @Schema(description = "CEP", example = "01001-000")
    String cep;

    @Schema(description = "Logradouro", example = "Rua das Flores, 123")
    String logradouro;

    @Schema(description = "Complemento", example = "Sala 101")
    String complemento;

    @Schema(description = "Bairro", example = "Centro")
    String bairro;

    @Schema(description = "Cidade", example = "São Paulo")
    String cidade;

    @Schema(description = "Estado (UF)", example = "SP")
    String estado;

    @Schema(description = "Latitude", example = "-23.55052000")
    BigDecimal latitude;

    @Schema(description = "Longitude", example = "-46.63330800")
    BigDecimal longitude;

    @Schema(description = "Limite de Crédito", example = "50000.00")
    BigDecimal limiteCredito;

    @Schema(description = "Prazo de Pagamento (dias)", example = "30")
    Short prazoPagamento;

    @Schema(description = "Valor da Última Compra", example = "1500.00")
    BigDecimal valorUltimaCompra;

    @Schema(description = "Cliente Bloqueado", example = "false")
    Boolean bloqueado;

    @Schema(description = "Motivo do Bloqueio")
    String motivoBloqueio;
}

