package com.alexurba.apirestboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication() //exclude = {DataSourceAutoConfiguration.class }
public class ApirestbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestbootApplication.class, args);
	}

}
