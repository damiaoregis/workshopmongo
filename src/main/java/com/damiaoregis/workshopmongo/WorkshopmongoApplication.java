package com.damiaoregis.workshopmongo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.damiaoregis.workshopmongo.domain.User;
import com.damiaoregis.workshopmongo.repositories.UserRepository;

@SpringBootApplication
public class WorkshopmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDatabase(UserRepository repository) {
		return args -> {
			repository.deleteAll();
			repository.saveAll(Arrays.asList(
				new User(null, "Maria Brown", "maria@gmail.com"),
				new User(null, "Alex Green", "alex@gmail.com")
			));
		};
	}

}
