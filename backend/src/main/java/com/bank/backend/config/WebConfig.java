package com.bank.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class WebConfig {

    @Value("${app.cors.allowed-origins:http://localhost:3000}")
    private String[] allowedOrigins;

    @Value("${app.cors.allowed-methods:GET,POST,PUT,PATCH,DELETE,OPTIONS}")
    private String[] allowedMethods;

    @Value("${app.cors.allowed-headers:*}")
    private String[] allowedHeaders;

    @Value("${app.cors.exposed-headers:Location}")
    private String[] exposedHeaders;

    @Value("${app.cors.allow-credentials:true}")
    private boolean allowCredentials;

    @Value("${app.cors.max-age:3600}")
    private long maxAge;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        // Support both comma-separated single string and array property binding
        String[] origins = flatten(allowedOrigins);
        String[] methods = flatten(allowedMethods);
        String[] reqHeaders = flatten(allowedHeaders);
        String[] resHeaders = flatten(exposedHeaders);

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(origins)
                        .allowedMethods(methods)
                        .allowedHeaders(reqHeaders)
                        .exposedHeaders(resHeaders)
                        .allowCredentials(allowCredentials)
                        .maxAge(maxAge);
            }
        };
    }

    private String[] flatten(String[] input) {
        // Handles cases where Spring injects the entire CSV as one element
        if (input == null || input.length == 0) return new String[0];
        if (input.length == 1) {
            return Arrays.stream(input[0].split("\\s*,\\s*"))
                    .filter(s -> !s.isBlank())
                    .toArray(String[]::new);
        }
        return input;
    }
}