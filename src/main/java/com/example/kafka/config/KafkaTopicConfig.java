package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.example.kafka.AppConstants;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic javaguidesTopic() {
		return TopicBuilder.name(AppConstants.TOPIC_NAME).build();
	}
}