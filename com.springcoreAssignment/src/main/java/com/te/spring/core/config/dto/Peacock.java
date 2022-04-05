package com.te.spring.core.config.dto;

public class Peacock implements Creature {

	@Override
	public String toString() {
		return "Peacock [creatureName()=" + creatureName() + ", creatureType()=" + creatureType() + "]";
	}

	public String creatureName() {
		String name = "Peacock";
		System.out.println("creatureName() is  " + name);

		return name;
	}

	public String creatureType() {
		String type = "Bird";
		System.out.println("creatureName() is  " + type);

		return type;

	}

}
