package com.OpenBootcamp.Ordenadores.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
     @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetail())
                .select()
                .apis(RequestHandlerSelectors.basePackage("co.OpenBootcap.Ordenadores.Controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiDetail(){
        return new ApiInfo("Spring Boot Laptop API REST",
                "Laptop Api rest docs",
                "1.0",
                "http://www.georsan.com",
                new Contact("George", "http://www.george.com", "jorgesandoal529@example.com"),
                "MIT",
                "http://www.google.com",
                Collections.emptyList());
    }


}
