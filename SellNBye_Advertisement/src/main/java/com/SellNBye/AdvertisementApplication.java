package com.SellNBye;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class AdvertisementApplication {
	public static void main(String args[]) {		
		SpringApplication.run(AdvertisementApplication.class, args);
	}
}
