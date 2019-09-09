package com.peekay.lambok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class LambokApplication {

	public static void main(String[] args) {
		log.debug("This message is due to @slf4j ");
		SpringApplication.run(LambokApplication.class, args);
	}

}
