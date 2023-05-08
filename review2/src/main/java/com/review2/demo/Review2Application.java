package com.review2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Football Database",
				version="1.1.2",
				description="Player Details and Project",
				contact=@Contact(
						name="Sreenath",
						email="sreenathcr771@gmail.com"
						)
				)	
		)
public class Review2Application {

	public static void main(String[] args) {
		SpringApplication.run(Review2Application.class, args);
	}

}
