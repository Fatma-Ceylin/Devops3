package org.example.devops2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Devops2Application {
    public static void main(String[] args) {
        SpringApplication.run(Devops2Application.class, args);
    }
}
