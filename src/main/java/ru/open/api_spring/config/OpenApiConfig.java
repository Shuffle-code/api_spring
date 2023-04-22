package ru.open.api_spring.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class OpenApiConfig {
    @Bean
    OpenAPI customOpenApi() {
        OpenAPI openAPI = new OpenAPI();
        openAPI.setInfo(info());
        return openAPI;
    }
    @Bean
    Info info() {
        return new Info().title("Реестр техники - REST-приложение с Open API v3 документацией в виде страницы swagger.")
                .description("Язык программирования: Java 8; " +
                        "Frameworks: Spring Boot Starter, Spring Web, Spring JPA, Spring Hibernate; База данных: Postgres SQL; " +
                        "Библиотека для генерации документации: springdoc-openapi v1.5.9.")
                .version("1.0")
                .license(licence())
                .contact(contact());
    }
    @Bean
    License licence() {
        return new License()
                .name("Unlicense")
                .url("https://unlicense.org");
    }
    @Bean
    Contact contact() {
        return new Contact().email("shuffle2149@gmail.com").name("Евгений Малюгин");
    }
}