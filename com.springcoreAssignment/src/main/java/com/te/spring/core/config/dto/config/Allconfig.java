package com.te.spring.core.config.dto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.te.spring.core.config.dto.Earth;

@Configuration
@Component
@Import({ Goldfishconfig.class, HumanBconfig.class, Lionconfig.class, Peacockconfig.class })
public class Allconfig {
	@Bean(name = "earth")
	public Earth getEarth() {
		Earth earth = new Earth();
		earth.getPlanetRadius();
		earth.getWaterOnPlanetPercentage();
		return earth;
	}
}