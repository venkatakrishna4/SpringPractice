package com.krish.annotationsDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of strings
	private String[] dataStrings = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	// create a random number generator
	private Random random = new Random();

	@Override
	public String getFortune() {
		// pick a random string from array
		int index = random.nextInt(dataStrings.length);
		return dataStrings[index];
	}

}
