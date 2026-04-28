package br.com.wassistemas.tasko.config;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskoApplicationConfig {

  @Value("${mailjet.api.key}")
  private String mailjetApiKey;

  @Value("${mailjet.secret.key}")
  private String mailjetApiSecret;

  @Bean
  public MailjetClient mailjetClient() {
    return new MailjetClient(ClientOptions.builder()
        .apiKey(mailjetApiKey)
        .apiSecretKey(mailjetApiSecret)
        .build()
    );
  }
}
