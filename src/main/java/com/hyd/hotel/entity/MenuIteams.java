package com.hyd.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MenuIteams {
	@Id
	String name;
	int price;
	public MenuIteams() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
