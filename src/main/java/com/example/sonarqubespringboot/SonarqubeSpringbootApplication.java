package com.example.sonarqubespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SonarqubeSpringbootApplication {

	public String helloWorld() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(SonarqubeSpringbootApplication.class, args);
	}

}
