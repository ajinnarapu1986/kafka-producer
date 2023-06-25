package com.javapoint.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javapoint.kafka.model.LogMessage;
import com.javapoint.kafka.service.KafkaLogMessageService;


@RestController
@RequestMapping("/api/v1/kafka")
public class LogMessageController {

	@Autowired
	private KafkaLogMessageService kafkaLogMessageService;

	@PostMapping("/logs-publish")
	public ResponseEntity<String> logsPublish(@RequestBody List<LogMessage> logMessages) {
		kafkaLogMessageService.sendMessage(logMessages);
		return ResponseEntity.ok("Message sent to kafka topic");
	}
}