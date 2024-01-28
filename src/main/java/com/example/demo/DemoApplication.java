package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ExampleService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(DemoApplication.class, args);
		ExampleService exampleService = context.getBean("exampleService", ExampleService.class);
		exampleService.getHello("Siema1423423");
		System.out.println(exampleService.getHello("Siema1423"));;
	}

}
