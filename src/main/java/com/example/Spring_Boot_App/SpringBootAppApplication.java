package com.example.Spring_Boot_App;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootAppApplication {

	public static void main(String[] args) {
		log.info("Processing started...");
		log.info("Processing started...");


		SpringApplication.run(SpringBootAppApplication.class, args);

	}

}
