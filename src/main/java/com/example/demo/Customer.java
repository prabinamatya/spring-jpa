package com.example.demo;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUST_ID")
	private Long id;
	
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private final List<Phone> phones = new ArrayList<>();

	public Customer(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	public Customer addPhone(String type, String number) {
		Phone phone = Phone.builder().type(type).number(number).build();
		this.phones.add(phone);
		return this;
	}


}