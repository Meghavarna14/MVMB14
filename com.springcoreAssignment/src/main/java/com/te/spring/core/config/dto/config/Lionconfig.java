package com.te.spring.core.config.dto.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.config.dto.Lion;

public class Lionconfig {
	@Bean(name = "lion")
	public Lion getLion() {
		Lion lion = new Lion();
		lion.creatureName();
		lion.creatureType();
		return lion;
	}
}
