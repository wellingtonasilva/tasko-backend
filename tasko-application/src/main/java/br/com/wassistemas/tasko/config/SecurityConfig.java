package br.com.wassistemas.tasko.config;

import br.com.wassistemas.tasko.common.security.JwtAuthenticationFilter;
import br.com.wassistemas.tasko.common.security.JwtTokenProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


  @Bean
  public JwtTokenProvider jwtTokenProvider() {
    return new JwtTokenProvider();
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http, JwtTokenProvider jwtTokenProvider)
      throws Exception {
    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/api/v1/empresas/criar", "/api/v1/login/**").permitAll()
            .anyRequest().authenticated()
        ).addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider),
            UsernamePasswordAuthenticationFilter.class);
    // Filtros JWT serão adicionados posteriormente
    return http.build();
  }
}
