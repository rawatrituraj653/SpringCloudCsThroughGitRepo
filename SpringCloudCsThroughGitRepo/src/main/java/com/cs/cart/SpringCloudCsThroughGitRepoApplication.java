package com.cs.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudCsThroughGitRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsThroughGitRepoApplication.class, args);
	}

}
