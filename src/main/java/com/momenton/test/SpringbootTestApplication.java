package com.momenton.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootTestApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/springboot-webservice/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringbootTestApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
