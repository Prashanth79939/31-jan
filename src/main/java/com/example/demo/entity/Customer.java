package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
@Id
String custId;
String name;
String address;
String mobile;
public Customer(String custId, String name, String address, String mobile) {
	super();
	this.custId = custId;
	this.name = name;
	this.address = address;
	this.mobile = mobile;
}
public String getCustId() {
	return custId;
}
public void setCustId(String custId) {
	this.custId = custId;
}
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
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "customer [custId=" + custId + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
}


}
