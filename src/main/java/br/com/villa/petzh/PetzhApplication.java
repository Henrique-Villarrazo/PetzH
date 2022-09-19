package br.com.villa.petzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class PetzhApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetzhApplication.class, args);
	}

}
