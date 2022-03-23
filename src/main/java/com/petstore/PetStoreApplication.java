package com.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableWebMvc
@OpenAPIDefinition(info = @Info(title = "Pet Store App", version = "1.0", description = "Information About Pets in the Store"))
public class PetStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
	}

}
