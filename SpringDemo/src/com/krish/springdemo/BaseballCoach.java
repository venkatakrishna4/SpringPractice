package com.krish.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field
	private FortuneService fortuneService;

	// Define a constructor
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
