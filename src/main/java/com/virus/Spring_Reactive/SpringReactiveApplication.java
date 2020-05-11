package com.virus.Spring_Reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveApplication.class, args);
		GreetingWebClient greetingWebClient = new GreetingWebClient();
		System.out.println(greetingWebClient.getResult());
	}
}
