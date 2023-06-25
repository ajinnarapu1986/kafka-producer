package com.example.kafka.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka.AppConstants;
import com.example.kafka.model.Product;

@Service
public class KafkaProducerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);

	@Autowired
	private KafkaTemplate<String, Product> kafkaTemplate;

	public void sendMessage(List<Product> products) {
		LOGGER.info(String.format("Message sent -> %s", products.size()));

		products.forEach(product -> {
			LOGGER.info("I am a Kafka Producer :: {}", product);

			kafkaTemplate.send(AppConstants.TOPIC_NAME, product);
		});

	}
}

