package ejercicioEndpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class EjercicioEndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioEndpointsApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Spring Boot API").version("0.11").description("Sample app Spring Boot 3").termsOfService("http://swagger.io/terms/").license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
	
}
