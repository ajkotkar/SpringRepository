package com.example.model;

public class Address {

	private String cityName;
	private String country;
	public String getCity() {
		return cityName;
	}
	public void setCity(String city) {
		this.cityName = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String city, String country) {
		this.cityName = city;
		this.country = country;
	}
	
	
}
