package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KannadaWish implements IndiaWishes {

	@Override
	public String festivalWish() {
		// TODO Auto-generated method stub
		return "Huttu habbada hardika shubhashayagalu";
	}

}
