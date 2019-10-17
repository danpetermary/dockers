package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages="com.example.demo")
@SpringBootApplication
public class DockerSampApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSampApplication.class, args);
	}

}
