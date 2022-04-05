package com.te.spring.core.config.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Earth {
	@Value("500")
	private double planetRadius;
	@Value("79")
	private double waterOnPlanetPercentage;
	@Autowired
	@Qualifier("peacock")
	private Creature creature;

	public Earth() {
		super();
	}

	public Earth(double planetRadius, double waterOnPlanetPercentage, Creature creature) {
		super();
		this.planetRadius = planetRadius;
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
		this.creature = creature;
	}

	public double getPlanetRadius() {
		return planetRadius;
	}

	public void setPlanetRadius(double planetRadius) {
		this.planetRadius = planetRadius;
	}

	public double getWaterOnPlanetPercentage() {
		return waterOnPlanetPercentage;
	}

	public void setWaterOnPlanetPercentage(double waterOnPlanetPercentage) {
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	@Override
	public String toString() {
		return "Earth [planetRadius=" + planetRadius + ", waterOnPlanetPercentage=" + waterOnPlanetPercentage
				+ ", creature=" + creature + "]";
	}
}