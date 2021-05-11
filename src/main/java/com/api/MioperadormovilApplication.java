package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.api")
@EnableSwagger2
public class MioperadormovilApplication {

	public static void main(String[] args) {
		SpringApplication.run(MioperadormovilApplication.class, args);
	}

}
