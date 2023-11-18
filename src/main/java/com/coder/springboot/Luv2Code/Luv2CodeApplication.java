package com.coder.springboot.Luv2Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.coder.springboot","com.luv2code.demo.rest"})
public class Luv2CodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Luv2CodeApplication.class, args);
	}

}
