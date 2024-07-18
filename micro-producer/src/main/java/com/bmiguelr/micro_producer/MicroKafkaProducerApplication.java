package com.bmiguelr.micro_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroKafkaProducerApplication.class, args);
	}

}
