package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Schema(description = "Dados para Adicioanr um Vendedor")
public class AdicionarVendedorRequest {
    @Schema(description = "Código do Vendedor", example = "0009-1")
    String codigoVendedor;

    @Schema(description = "Nome completo", example = "João Silva")
    String nomeVendedor;

    @Schema(description = "Número do CPF", example = "999.999.999-99")
    String numeroCPF;

    @Schema(description = "E-mail principal do Vendedor", example = "joao.silva@email.com")
    String email;

    @Schema(description = "Número de Telefone", example = "(99) 99999-9999")
    String numeroTelefone;

    @Schema(description = "Valor da Meta Mensal", example = "99.99")
    Float valorMetaMensal;

    @Schema(description = "Percentual de Comissão", example = "9.9")
    Float percentualComissao;

    @Schema(description = "Id. do Supervisor Responsável", example = "1")
    Long supervisorId;

    @Schema(description = "Id. do Território", example = "2")
    Long territorioId;
}