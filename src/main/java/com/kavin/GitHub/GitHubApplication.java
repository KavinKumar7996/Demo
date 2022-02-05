package com.kavin.GitHub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubApplication {
	
	Message message= new Message();
	public static void main(String[] args) {
		SpringApplication.run(GitHubApplication.class, args);
	}
	Logger logg=LoggerFactory.getLogger(GitHubApplication.class);
	
	public void print(){
		logg.debug(message.getMessage());
		System.out.println(message.getMessage());
	}
	

}
