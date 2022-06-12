package com.krish.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// Create literal values
	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println(CricketCoach.class.getName() + ": inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(CricketCoach.class.getName() + " inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

}
