package com.example.demo;

import com.example.demo.configuration.CustomerRepositoryPopulation;
import com.example.demo.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = SpringJpaApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ContextConfiguration(classes = CustomerRepositoryPopulation.class)
public class CustomerServiceTest {


    @Autowired
    private CustomerService customerService;

    @Test
    public void testGetAllCustomers() {
        List<Customer> allCustomers = customerService.getAllCustomers();

        assertEquals(4, allCustomers.size());
    }
}
