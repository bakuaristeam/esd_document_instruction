package com.Aris.ESD_Document_Instruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class EsdDocumentInstructionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsdDocumentInstructionApplication.class, args);
	}

}
