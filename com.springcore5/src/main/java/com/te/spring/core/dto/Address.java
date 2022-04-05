package com.te.spring.core.dto;

public class Address {
	private int aId;
	private String aCity;
	private String aState;
	
	public Address() {
		super();
	}

	public Address(int aId, String aCity, String aState) {
		super();
		this.aId = aId;
		this.aCity = aCity;
		this.aState = aState;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaCity() {
		return aCity;
	}

	public void setaCity(String aCity) {
		this.aCity = aCity;
	}

	public String getaState() {
		return aState;
	}

	public void setaState(String aState) {
		this.aState = aState;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", aCity=" + aCity + ", aState=" + aState + "]";
	}

	

}
