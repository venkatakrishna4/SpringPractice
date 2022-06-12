package com.krish.annotationsDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	// Create field for FortuneService
	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
public void doMyCleanupStuff() {
	System.out.println("TennisCoach: inside of doMyCleanupStuff()");
}
	/*
	 * // create constructor for implementing autowired
	 * 
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/*
	 * // Setter injection
	 * 
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

}
