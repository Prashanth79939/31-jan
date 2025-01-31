package com.hyd.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyd.hotel.entity.Hotel;
import com.hyd.hotel.repo.HotelRepo;

@Service
public class HotelService {
	
	@Autowired
	HotelRepo hRepo;

	public void addNewHotel(Hotel newHotel) {
		
		hRepo.save(newHotel);
		
	}

}
