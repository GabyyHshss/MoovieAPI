package dev.gabriel.jpaTest;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JpaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Moovie Prime Video API")
						.version("0.1")
						.description("Esta API RESTful está diseñada para facilitar la implementación de un servicio de streaming que permita a los usuarios revisar y previsualizar series y películas. Se ha desarrollado con una arquitectura débilmente acoplada, lo que permite que las dos partes evolucionen en paralelo e independientemente. Pila: utilicé MongoDB para la base de datos, Java con Spring Boot para el backend y React para el frontend")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
