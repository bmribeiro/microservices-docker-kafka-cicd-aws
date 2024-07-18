package com.bmiguelr.micro_consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "test_topic", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}
}
