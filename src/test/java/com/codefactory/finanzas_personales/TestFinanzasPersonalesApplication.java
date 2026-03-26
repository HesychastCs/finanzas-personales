package com.codefactory.finanzas_personales;

import org.springframework.boot.SpringApplication;

public class TestFinanzasPersonalesApplication {

	public static void main(String[] args) {
		SpringApplication.from(FinanzasPersonalesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
