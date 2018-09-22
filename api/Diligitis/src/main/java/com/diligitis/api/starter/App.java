package com.diligitis.api.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.diligitis.api.repository")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
