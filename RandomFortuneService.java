package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component()
public class RandomFortuneService implements FortuneService {

	//create an array of Strings
	private String[] data = {
			"hello I am yours","hi i love u","hi i miss u"
	};
	
	//create a random no generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index =myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
