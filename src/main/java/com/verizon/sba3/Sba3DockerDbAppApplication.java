package com.verizon.sba3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sba3DockerDbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sba3DockerDbAppApplication.class, args);
		
		System.out.println("This is the update pushed from the Local Repo");
	
	}
}
