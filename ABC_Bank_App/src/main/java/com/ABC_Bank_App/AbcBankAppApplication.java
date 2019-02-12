package com.ABC_Bank_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan("com")
public class AbcBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcBankAppApplication.class, args);
	}

}

