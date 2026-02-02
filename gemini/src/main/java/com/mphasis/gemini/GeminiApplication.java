package com.mphasis.gemini;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class GeminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeminiApplication.class, args);
	}
	
	WebClient client = WebClient.create();

	String responseInput = client.get()
	        .uri("http://localhost:9091/users/allAka")
	        .retrieve()
	        .bodyToMono(String.class)
	        .block();
	
	

	
	@Bean
	public CommandLineRunner runner(ChatClient.Builder builder) {
	    return args -> {
	    	
	    	
	    	System.out.println("==========================================================");
	    	System.out.println(responseInput);
	    	
	    	
	    	System.out.println("==========================================================");
	    	
	        ChatClient chatClient = builder.build();
	        String response = chatClient.prompt("make a list usernames " + responseInput ).call().content();							
	        System.out.println(response);
	    };
	}

}
