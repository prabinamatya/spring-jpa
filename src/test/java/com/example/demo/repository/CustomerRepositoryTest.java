package com.example.demo.repository;

import com.example.demo.configuration.CustomerRepositoryPopulation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.Customer;
import com.example.demo.SpringJpaApplication;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = SpringJpaApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
//@ContextConfiguration(classes = CustomerRepositoryPopulation.class)
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository repository;

	@Test
	public void findAllCustomers() {

		Iterable<Customer> allCustomers = repository.findAll();
		for (Customer customer : allCustomers) {
			System.out.println("customer = " + customer);
		}


	}


	@Test
	public void find1Customer() {
		Optional<Customer> byId = repository.findById((long) 1);

		assertEquals("Jack", byId.get().getFirstName());
		assertEquals("cell", byId.get().getPhones().get(0).getType());
	}


	@Test
	public void findByLastNametest() {

		Customer customer = repository.findByLastName("Dessler");

		assertEquals("Michelle", customer.getFirstName());

		assertEquals("land1", customer.getPhones().get(0).getType());

	}


	public void findCustomersPhoneTest() {
	}
}
