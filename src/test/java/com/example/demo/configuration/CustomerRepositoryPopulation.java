package com.example.demo.configuration;

import com.example.demo.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRepositoryPopulation {


//    @Bean
//    public boolean populateRepo(CustomerRepository repository) {
//        repository.save(Customer.builder().firstName("Jack").lastName("Bauer").build().addPhone("cell", "2342546"));
//        repository.save(Customer.builder().firstName("Chloe").lastName("O'Brian").build().addPhone("land", "12344"));
//        repository.save(Customer.builder().firstName("Kim").lastName("Bauer").build().addPhone("cell1", "4556"));
//        repository.save(Customer.builder().firstName("David").lastName("Palmer").build().addPhone("cell2", "2356"));
//        repository.save(Customer.builder().firstName("Michelle").lastName("Dessler").build().addPhone("land1", "536"));
//        return true;
//    }

}