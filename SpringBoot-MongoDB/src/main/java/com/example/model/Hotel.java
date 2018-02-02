package com.example.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hotels")
public class Hotel {
	
	@Id
	private String id;
	private String hotelName;
	@Indexed(direction= IndexDirection.ASCENDING)
	private int pricePerNight;
	private Address address;
	private List<Review> reviews;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public Hotel(String hotelName, int pricePerNight, Address address, List<Review> reviews) {
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.address = address;
		this.reviews = reviews;
	}
	
	
}
