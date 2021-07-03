package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return null;
	}

}
