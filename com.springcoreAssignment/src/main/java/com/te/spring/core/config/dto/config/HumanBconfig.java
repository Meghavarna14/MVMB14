package com.te.spring.core.config.dto.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.config.dto.Goldfish;
import com.te.spring.core.config.dto.Humanbeing;

public class HumanBconfig {
	@Bean(name = "humanbeing")
	public Humanbeing getHumanbeing() {
		Humanbeing humanbeing = new Humanbeing();
		humanbeing.creatureName();
		humanbeing.creatureType();
		return humanbeing;
	}
}
