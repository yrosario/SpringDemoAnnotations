package com.spring.demo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"the journey is the reward"
	};
	
	//create a random number regerator
	private Random myRandom = new Random();
	
	@Override
	public String getDailyFortune() {
		// pick a random string from the array
		int index  = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
