package com.care.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient02Application.class, args);
	}
	
	@LoadBalanced
	@Bean
	WebClient.Builder loadBalanced(){
		return WebClient.builder();
	}
}
