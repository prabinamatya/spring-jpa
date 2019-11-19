package com.example.demo.model;

import org.junit.jupiter.api.Test;

import com.example.demo.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

	@Test
	public void gettersAndSetters() {
		Customer customer = new Customer();
		customer.setFirstName("first name");
		customer.setLastName("last name");
		assertEquals("first name", customer.getFirstName());
		assertEquals("last name", customer.getLastName());
	}
	
	
}
