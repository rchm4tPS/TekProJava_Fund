package com.example.rachmat.finalCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.rachmat.finalCRUD.controllers"})
@ComponentScan({"com.example.rachmat.finalCRUD.pojo"})
public class FinalCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalCrudApplication.class, args);
	}

}
