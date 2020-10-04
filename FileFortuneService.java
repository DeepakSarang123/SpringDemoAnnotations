package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

import org.springframework.stereotype.Component;


@Component
public class FileFortuneService implements FortuneService{

	@Override
	public String getFortune(){
		
		Random myRand = new Random();
		try{
		// read from txt file
		Scanner in = new Scanner(new File("D:\\Users\\deepa\\Documents\\FortuneWishes.txt"));
		
		//convert to Array
		List<String> list = new ArrayList<String>();
		while(in.hasNext()) {
			String token = in.nextLine();
			list.add(token);
		}
		String[] FortuneArr = list.toArray(new String[0]);
		
		//Return random wishes
		int index = myRand.nextInt(FortuneArr.length);
	    String result= FortuneArr[index];
	    return result;
		
		
		}catch(IOException e) {System.out.println("Exception :"+ e);}
		return null;
	}

}
