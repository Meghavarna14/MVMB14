package com.te.spring.core.config.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Humanbeing implements Creature {

	@Override
	public String toString() {
		return "Humanbeing [creatureName()=" + creatureName() + ", creatureType()=" + creatureType() + "]";
	}

	public String creatureName() {

		String name = "Humanbeing";
		System.out.println("creatureName() is  " + name);
		return name;
	}

	public String creatureType() {

		String type = "Human";
		System.out.println("creatureName() is  " + type);
		return type;

	}

}
