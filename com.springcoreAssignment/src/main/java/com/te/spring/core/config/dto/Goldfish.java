package com.te.spring.core.config.dto;

public class Goldfish implements Creature {

	public String creatureName() {

		String name = "Goldfish";
		System.out.println("creatureName() is  " + name);
		return name;

	}

	public String creatureType() {
		String type = "Aquatic";
		System.out.println("creatureType() is  " + type);

		return type;

	}

	@Override
	public String toString() {
		return "Goldfish [creatureName()=" + creatureName() + ", creatureType()=" + creatureType() + "]";
	}

}
