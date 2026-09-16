package com.substring.agent.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AiAgentBackendApplication {

	private static final Logger log = LoggerFactory.getLogger(AiAgentBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AiAgentBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner logModelOnStartup(
			@Value("${spring.ai.openai.chat.options.model}") String model) {
		return args -> log.info("AI chat model: {}", model);
	}

}
