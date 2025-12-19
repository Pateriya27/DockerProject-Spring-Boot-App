package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerProj01BootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProj01BootAppApplication.class, args);
		System.out.println("Welcome to Docker Apps");
	}

}
