package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		int i=10;
		SpringApplication.run(Application.class, args);
		int age=18;
		double price=20.00;
		System.out.println(price);
		String name="Raju";
	}

}
