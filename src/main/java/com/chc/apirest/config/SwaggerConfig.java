package com.chc.apirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase de configuración para ejecutar Swagger, documentación de API-REST.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                /**
                 * Creamos Rest diferentes y se adapta la documentación para que no se repite
                 */
                .apis(RequestHandlerSelectors.any())
                /**
                 * paths(PathSelectors.any , busca todos los apis y todos los request para generar la documentación,
                 * puedes especificar el que quieres.
                 */
                .paths(PathSelectors.any())
                /**
                 * construye la documentación.
                 */
                .build();
    }
}
