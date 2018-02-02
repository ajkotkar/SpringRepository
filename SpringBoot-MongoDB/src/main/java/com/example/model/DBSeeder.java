package com.example.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner{

	
	private HotelRepository hotelRepository;
	
	public DBSeeder(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Hotel marriot = new Hotel(
				"Marriot", 
				130, 
				new Address("Mumbai", "India"), 
				Arrays.asList(
						new Review("Akash", 8, false),
						new Review("Apurva", 9, true)
						)
				);
		Hotel taj = new Hotel(
				"Taj", 
				180, 
				new Address("Mumbai", "India"), 
				Arrays.asList(
						new Review("Akash", 8, false),
						new Review("Apurva", 9, true)
						)
				);
		Hotel hayaat = new Hotel(
				"Hayaat", 
				130, 
				new Address("Pune", "India"), 
				Arrays.asList(
						new Review("Akash", 8, false),
						new Review("Apurva", 9, true)
						)
				);
		
		// dropping all hotels
		hotelRepository.deleteAll();
		
		// adding predefined list of hotels
		List<Hotel> hotels = Arrays.asList(marriot,taj,hayaat);
		hotelRepository.save(hotels);
		
	}

	
}
