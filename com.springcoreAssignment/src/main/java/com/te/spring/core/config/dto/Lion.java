package com.te.spring.core.config.dto;

public class Lion implements Creature {

	@Override
	public String toString() {
		return "Lion [creatureName()=" + creatureName() + ", creatureType()=" + creatureType() + "]";
	}

	public String creatureName() {

		String name = "Lion";
		System.out.println("creatureName() is  " + name);
		return name;
	}

	public String creatureType() {
		String type = "Wild Animal";
		System.out.println("creatureName() is  " + type);

		return type;

	}

}
