package com.springboot.restuarant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestuarantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestuarantApplication.class, args);
		System.out.print("hello from server");
		System.out.print("hello from local");
		System.out.print("hello from vs code");
	}

}
