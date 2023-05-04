package com.snmaddula.smartms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SmartServiceApp {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SmartServiceApp.class, args);
		} catch (Throwable t) {
			log.error("Startup Failed with errors.", t);
		}
	}
}
