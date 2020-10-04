package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
    
	
	private FortuneService fortuneService;
	
	
	private IndiaWishes indiaWishes;
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService,@Qualifier("kannadaWish")IndiaWishes indiaWishes) {
		System.out.println(">>TennisCoach:inside custom constructor");
		this.fortuneService = fortuneService;
		this.indiaWishes = indiaWishes;
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach:inside of doMystartupStuff() ");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach:inside of doMyCleanupStuf() ");
	}
	
	
	/*@Autowired
	public TennisCoach(@Qualifier("kannadaWish")IndiaWishes indiaWishes) {
		System.out.println(">>TennisCoach:inside custom constructor");
		this.indiaWishes = indiaWishes;
	}
	
	/*
	//define a setter method
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach:inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	
	@Autowired
	public void doSomeMadStuff(IndiaWishes theIndiaWishes ) {
		System.out.println(">>TennisCoach:inside doSomeMadStuff() method");
		indiaWishes = theIndiaWishes ;
	}
	
	/*
	//@Autowired
	public TennisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
    */
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practise 100 smashes everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	@Override
	public String getIndiaWishes() {
		// TODO Auto-generated method stub
		return indiaWishes.festivalWish();
	}

}
