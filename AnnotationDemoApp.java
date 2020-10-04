package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
       //read spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("trekkingCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call method to get the Indian wish
		System.out.println(theCoach.getIndiaWishes());
		
		//call values
		//System.out.println(theCoach.getEmail());
		//System.out.println(theCoach.getTeam());
		
		//close context
		context.close();
	}

}
