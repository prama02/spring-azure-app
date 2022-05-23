package com.pratheek.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Love you Manasa lotsssssssss!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
