package br.com.wassistemas.tasko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {"br.com.wassistemas.tasko"}
)
@EnableJpaRepositories(basePackages = "br.com.wassistemas.tasko")
@EntityScan(basePackages = "br.com.wassistemas.tasko")
public class TaskoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaskoApplication.class, args);
	}
}
