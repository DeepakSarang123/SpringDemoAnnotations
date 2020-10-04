package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	private IndiaWishes indiaWishes;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService theFortuneService, IndiaWishes theIndiaWishes) {
		 fortuneService = theFortuneService;
		 indiaWishes = theIndiaWishes;
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim intensely for 30 mns everyday";
	}



	@Override
	public String getIndiaWishes() {
		// TODO Auto-generated method stub
		return indiaWishes.festivalWish();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	
	/*
	//injecting dependencies
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("kannadaWish")
	private IndiaWishes indiaWishes;
	
	//declaring values
	@Value("")
	private String email;
	
	@Value("$(foo.team)")
	private String team;
	
	public SwimCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		// give Coaching instructions
		return "Do 30 mns of intense swimming everyday";
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

	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	*/
}
