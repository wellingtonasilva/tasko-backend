package br.com.wassistemas.tasko.vendedor.adapter.in.web.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@Data
public class AdicionarVendedorSupervisorRequest {
    String nomeSupervisor;
}
