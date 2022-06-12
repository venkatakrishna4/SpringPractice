package com.krish.annotationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.krish.annotationsDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for swimcoach and inject dependency
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
