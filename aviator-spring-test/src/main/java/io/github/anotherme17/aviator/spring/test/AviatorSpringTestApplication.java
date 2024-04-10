package io.github.anotherme17.aviator.spring.test;

import io.github.anotherme17.aviator.spring.support.announce.EnableSpringAviator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSpringAviator
public class AviatorSpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviatorSpringTestApplication.class, args);
    }

}
