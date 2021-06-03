package com.ahmed.assafar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class AssafarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssafarApplication.class, args);
	}

}
