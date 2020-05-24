package com.jdutton.jokes.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisJokesUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesUiApplication.class, args);
	}

}
