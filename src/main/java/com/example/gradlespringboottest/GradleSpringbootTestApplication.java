package com.example.gradlespringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GradleSpringbootTestApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GradleSpringbootTestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(GradleSpringbootTestApplication.class, args);
    }

}