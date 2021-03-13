package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int i=0;
	}
	public void doProcess(){
		System.out.println("Kaam Karo Naam Karo");
	}
}
