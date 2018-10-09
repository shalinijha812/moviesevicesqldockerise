package com.stackroute.movieservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    public class SwaggerConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(regex("/api/v1/movie.*"))
                    .build();
        }
        private ApiInfo apiInfo() {
            return new ApiInfo(
                    "My REST API",
                    "Some custom description of API.",
                    "API TOS",
                    "Terms of service",
                    new Contact("John Doe", "www.example.com", "myeaddress@company.com"),
                    "License of API", "API license URL", Collections.emptyList());
        }
    }

//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select().apis(RequestHandlerSelectors.basePackage("com.stackroute.movieservice"))
//                .paths(regex("/api/v1/movie.*"))
//                .build();
//                .apiInfo(metaData());
//    }
//
//
//
//    private ApiInfo metaData() {
//        //return new ApiInfoBuilder()
//        ApiInfo apiInfo = new ApiInfo(
//                .title("Spring Boot REST API")
//                .description("\"Spring Boot REST API for Online Store\"")
//                .version("1.0.0")
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"");
//                //        .contact(new Contact("John Thompson", "https://springframework.guru/about/", "john@springfrmework.guru"))
////                .build();
//        return apiInfo;
//
//    }

}


