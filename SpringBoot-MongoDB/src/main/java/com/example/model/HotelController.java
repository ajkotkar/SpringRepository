package com.example.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelRepository hotelRepository;

	
	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}


	@RequestMapping("/all")
	public List<Hotel> getAll(){
		List<Hotel> hotels = hotelRepository.findAll();
		return hotels;
		
	}
	
	
}
