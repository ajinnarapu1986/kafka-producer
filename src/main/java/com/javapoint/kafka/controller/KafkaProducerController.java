package com.javapoint.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javapoint.kafka.model.Product;
import com.javapoint.kafka.service.KafkaProducerService;


@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

	@Autowired
	private KafkaProducerService kafkaProducerService;

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody List<Product> products) {
		kafkaProducerService.sendMessage(products);
		return ResponseEntity.ok("Message sent to kafka topic");
	}
}