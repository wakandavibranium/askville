package com.app.askville;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AskvilleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AskvilleApplication.class, args);
	}

}
