package com.nagp.ucp.payment;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({ "com.nagp.ucp" })
public class UcpServicePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcpServicePaymentApplication.class, args);
	}

	// Configured For Rabbit Listener
	@Bean
	public org.springframework.amqp.support.converter.MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}

}
