package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("databaseFortuneService")
public class DatabaseFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Class gets over in 6 hours!";
	}



}
