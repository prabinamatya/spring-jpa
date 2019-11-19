package com.example.demo;

import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Transactional
    public List<Customer> getAllCustomers() {
        Iterable<Customer> all = customerRepository.findAll();
        List<Customer> customerList = StreamSupport.stream(all.spliterator(), false).collect(Collectors.toList());
        return customerList;
    }
}
