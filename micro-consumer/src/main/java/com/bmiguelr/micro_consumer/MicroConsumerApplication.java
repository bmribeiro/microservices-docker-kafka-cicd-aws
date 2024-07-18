package com.bmiguelr.micro_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroConsumerApplication.class, args);
	}

}
