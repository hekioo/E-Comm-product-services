package com.techie.microservices.product_services;

import org.springframework.boot.SpringApplication;

public class TestProductServicesApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServicesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}