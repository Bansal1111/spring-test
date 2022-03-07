package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringbootFirstAppApplication {
	
	@GetMapping("/")
	public String welcome() {
		return ("Congo ! App deployed successfully ");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
