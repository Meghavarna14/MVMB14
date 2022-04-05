package com.te.spring.core.config.dto.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.config.dto.Peacock;

public class Peacockconfig {
	@Bean(name = "peacock")
	public Peacock getPeacock() {
		Peacock peacock = new Peacock();
		peacock.creatureName();
		peacock.creatureType();
		return peacock;

	}
}
