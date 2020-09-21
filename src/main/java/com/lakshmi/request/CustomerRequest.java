package com.lakshmi.request;

import java.io.Serializable;

//import com.lakshmi.controller.GetCustomerDetailsbyIdResponse;

public class CustomerRequest implements Serializable {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	private Integer id;
	private String firstName;
	private String lastName;
	private String address;
	private Integer phoneNumber;
	private String item;

	public void CustomerRequest() {
	}

	public void CustomerRequest(Integer id, String firstname, String lastname, String address, Integer phoneNumber,
			String item) {
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.item = item;
	}

	@Override
	public String toString() {
		return "CustomerRequest[id=" + id + ",firstName= " + firstName + ",lastName=" + lastName + ",address=" + address
				+ ",phoneNUmber=" + phoneNumber + ",item=" + item + "]";
	}
}