package com.thecodealchemist.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	KeyVaultProperties keyVaultProperties;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hey, our secret is url ->" + keyVaultProperties.getUrl());
        System.out.println("Hey, our secret is username -> " + keyVaultProperties.getUsername());
        System.out.println("Hey, our secret is password -> " + keyVaultProperties.getPassword());
    }
}