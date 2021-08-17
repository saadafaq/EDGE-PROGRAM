package com.example.DynamicProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DynamicPropertiesApplication {
	public static void main(String[] args) {
		SpringApplication.run(DynamicPropertiesApplication.class, args);
	}

}
