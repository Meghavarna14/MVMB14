package com.te.spring.core.config.dto.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.config.dto.Goldfish;

public class Goldfishconfig {
	@Bean(name = "goldfish")
	public Goldfish getGoldfish() {
		Goldfish fish = new Goldfish();
		fish.creatureName();
		fish.creatureType();
		return fish;
	}

}
