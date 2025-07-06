package com.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmsDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsDiscoveryApplication.class, args);
	}

}
