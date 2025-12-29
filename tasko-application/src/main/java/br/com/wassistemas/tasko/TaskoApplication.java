package br.com.wassistemas.tasko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {"br.com.wasistemas.tasko"}
)
@EnableJpaRepositories(basePackages = "br.com.wasistemas.tasko")
@EntityScan(basePackages = "br.com.wasistemas.tasko")
public class TaskoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaskoApplication.class, args);
	}
}
