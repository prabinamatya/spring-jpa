package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Customer;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


    Customer findByLastName(String lName);
}
