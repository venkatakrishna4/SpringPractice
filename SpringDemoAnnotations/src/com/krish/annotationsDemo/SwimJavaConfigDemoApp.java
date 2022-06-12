package com.krish.annotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// Read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call the methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// call the newly created fields injection methods
		System.out.println("Email: " + theCoach.getEmailString());
		System.out.println("Team: " + theCoach.getTeamString());

		// close the context
		context.close();
	}

}
