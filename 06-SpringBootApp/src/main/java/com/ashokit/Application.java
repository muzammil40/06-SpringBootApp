package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
         Private Map<String,Object> cache= new HashMap<String,Object>();
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int i=0;
	}
	public void loadDataCache(){
		//logic
	}

}
