package com.bmiguelr.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("microservice1_route", r -> r.path("/microservice1/**").uri("lb://microservice-kafka-producer"))
				.route("microservice2_route", r -> r.path("/microservice2/**").uri("lb://microservice-kafka-consumer")).build();
	}
}
