package com.sa.employeeApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long addressId;
	
	private String address1;
	
	private String city;
	
	private String state;
	
	private String postalCode;
	
	@ManyToOne
	@JoinColumn(name="employeeid")
	private Employee employee;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address1=" + address1 + ", city=" + city + ", state=" + state
				+ ", postalCode=" + postalCode + "]";
	}

	
}
