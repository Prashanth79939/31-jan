package com.hyd.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {
	
	@Id
	String name;
	String address;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "hotel [name=" + name + ", address=" + address + ", city=" + city + "]";
	}
	

}
