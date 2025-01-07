package com.queirozisrael.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "resources")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
