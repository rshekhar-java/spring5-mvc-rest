package com.rs.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.rs.springframework.api.v1"})
//@EnableJpaRepositories("com.rs.springframework.repositories")
public class Spring5MvcRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5MvcRestApplication.class, args);
    }

}
