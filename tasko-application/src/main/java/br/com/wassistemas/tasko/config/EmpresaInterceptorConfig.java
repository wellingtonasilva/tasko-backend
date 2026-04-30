package br.com.wassistemas.tasko.config;

import br.com.wassistemas.tasko.common.security.EmpresaPermissionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class EmpresaInterceptorConfig implements WebMvcConfigurer {

  private final EmpresaPermissionInterceptor empresaPermissionInterceptor;

  @Autowired
  public EmpresaInterceptorConfig(EmpresaPermissionInterceptor empresaPermissionInterceptor) {
    this.empresaPermissionInterceptor = empresaPermissionInterceptor;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(empresaPermissionInterceptor)
        .addPathPatterns("/api/v1/vendedores/**",
            "/api/v1/clientes/**",
            "/api/v1/produtos/**",
            "/api/v1/usuarios/**",
            "/api/v1/supervisores/**");
  }
}

