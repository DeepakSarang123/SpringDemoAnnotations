package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	
   //define a bean for fortuneservice
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define a bean for IndiaWishes
	@Bean
	public IndiaWishes indiaWishes() {
		return new KannadaWish();
	}
	
	//define a bean for SwimCoach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService(),indiaWishes());
	}
	
}
