package com.common.iorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class IorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(IorderApplication.class, args);
	}

}
