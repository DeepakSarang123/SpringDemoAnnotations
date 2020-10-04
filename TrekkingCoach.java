package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrekkingCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("kannadaWish")
	private IndiaWishes indiaWishes;
	
	@Override
	public String getDailyWorkout() {
		//Give Coaching instructions
		return "Do 15 miles of trek every week";
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
