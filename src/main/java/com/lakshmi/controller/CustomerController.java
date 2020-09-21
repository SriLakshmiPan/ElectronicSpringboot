package com.lakshmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.request.CustomerRequest;
import com.lakshmi.response.CustomerResponse;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	List<CustomerRequest> customerList = new ArrayList<CustomerRequest>();
	List<CustomerResponse> customerList1 = new ArrayList<CustomerResponse>();

		//http://localhost:8080/customer/addCustomerDetails
	@PostMapping("/addCustomerDetails")
	public String newCustomer(@RequestBody CustomerRequest newCustomer) {
		customerList.add(newCustomer);
		return "Customer added";
	}

		//http://localhost:8080/customer/getCustomerDetailsbyId?custid=1
	@GetMapping("/getCustomerDetailsbyId")
	public CustomerRequest getCustomerDetails(@RequestParam Integer custid) {
		System.out.println("customerList" + customerList.toString());
		for (CustomerRequest cust : customerList) {
			if (cust.getId() == custid) {
				return cust;
			}
		}
		return null;
	}

	@GetMapping("/getCustomerName")
	public String getCustomerName(@RequestParam Integer custid) {
		System.out.println("customerList" + customerList.toString());
		for (CustomerRequest cust : customerList) {
			System.out.println("cust.getId() cust.getId()" + cust.getId());
			System.out.println("custidcustid" + custid);
			if (cust.getId() == custid) {
				return cust.getFirstName();
			}
		}
		return null;
	}

	@GetMapping("/getCustomerFirstNameLastName")
	public String getCustomerFirstLast(@RequestParam Integer custid) {
		for (CustomerRequest cust : customerList) {
			if (cust.getId() == custid) {
				String FirstName = cust.getFirstName();
				String LastName = cust.getLastName();
				String name = FirstName + " " + LastName;
				return name;
			}
		}
		return null;
	}

	@GetMapping("/getAddressById")
	public String getAddress(@RequestParam Integer custid) {
		for (CustomerRequest cust : customerList) {
			if (cust.getId() == custid) {
				String Address = cust.getAddress();
				String FirstName = cust.getFirstName();
				String LastName = cust.getLastName();
				String name = FirstName + " " + LastName;
				String nameadd = name + "'s address is " + Address;
				return nameadd;
			}
		}
		return null;
	}

	@GetMapping("/getCustomerByPhoneNumber")
	public CustomerResponse getPhoneNumber(@RequestParam Integer phoneNumber) {
		for (CustomerRequest cust : customerList) {
			if (cust.getPhoneNumber().equals(phoneNumber)) {
				CustomerResponse response = new CustomerResponse();
				response.setId(cust.getId());
				response.setFirstName(cust.getFirstName());
				response.setLastName(cust.getLastName());
				return response;
			}
		}
		return null;
	}
}