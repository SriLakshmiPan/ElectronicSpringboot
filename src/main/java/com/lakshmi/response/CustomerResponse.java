package com.lakshmi.response;

import java.io.Serializable;

public class CustomerResponse implements Serializable {
	private static final long serialVersionUID = 3306262202563164113L;

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

	private Integer id;
	private String firstName;
	private String lastName;

	public void CustomerResponse() {
	}

	public void CustomerResponse(Integer id, String firstname, String lastname) {
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;

	}

	@Override
	public String toString() {
		return "CustomerResponse[id=" + id + ",firstName= " + firstName + ",lastName=" + lastName + "]";
	}
}
